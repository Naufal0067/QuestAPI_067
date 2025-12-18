package com.example.localrestapi.modedata

import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer

@Serializable
data class Siswa(
    val id : Int,
    val nama : String,
    val alamat : String,
    val telepon : String
)