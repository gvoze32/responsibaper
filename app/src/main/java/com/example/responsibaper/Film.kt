package com.example.responsibaper

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Film (val poster: Int, val judul: String, val deskripsi: String, val genre: String) : Parcelable