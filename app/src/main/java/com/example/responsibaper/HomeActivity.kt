package com.example.responsibaper

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    private lateinit var btnBack : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        btnBack = findViewById(R.id.btnBack)

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val filmlist = listOf<Film>(
            Film(
                R.drawable.dune,
                "Dune (2021)",
                "A noble family becomes embroiled in a war for control over the galaxy's most valuable asset while its heir becomes troubled by visions of a dark future.",
                "Action, Adventure, Drama"
            ),
            Film(
                R.drawable.interstellar,
                "Interstellar (2014)",
                "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
                "Adventure, Drama, Sci-Fi"
            ),
            Film(
                R.drawable.contact,
                "Contact (1997)",
                "Dr. Ellie Arroway, after years of searching, finds conclusive radio proof of extraterrestrial intelligence, sending plans for a mysterious machine.",
                "Drama, Mistery, Sci-Fi"
            ),
            Film(
                R.drawable.gravity,
                "Gravity (2013)",
                "Two astronauts work together to survive after an accident leaves them stranded in space.",
                "Action, Drama, Sci-Fi"
            ),
            Film(
                R.drawable.prometheus,
                "Prometheus (2012)",
                "Following clues to the origin of mankind, a team finds a structure on a distant moon, but they soon realize they are not alone.",
                "Mistery, Adventure, Sci-Fi"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = FilmAdapter(this, filmlist) {
        }
    }
}