package com.example.responsibaper

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter (private val context: Context, private val Film: List<Film>, val listener: (Film) -> Unit)
    : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>(){

    class FilmViewHolder(view: View): RecyclerView.ViewHolder(view) {


        val imgFilm = view.findViewById<ImageView>(R.id.poster)
        val judul = view.findViewById<TextView>(R.id.judul)
        val deskripsi = view.findViewById<TextView>(R.id.deskripsi)
        val genre = view.findViewById<TextView>(R.id.genre)

        fun bindView(Film: Film, listener: (Film) -> Unit) {
            imgFilm.setImageResource(Film.poster)
            judul.text = Film.judul
            deskripsi.text = Film.deskripsi
            genre.text = Film.genre
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        return FilmViewHolder(
            LayoutInflater.from(context).inflate(R.layout.filmtemplate, parent, false)
        )
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.bindView(Film[position], listener)
    }

    override fun getItemCount(): Int = Film.size

}