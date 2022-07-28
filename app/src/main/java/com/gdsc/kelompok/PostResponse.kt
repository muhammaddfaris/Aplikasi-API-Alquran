package com.gdsc.kelompok

import com.google.gson.annotations.SerializedName

data class PostResponse(
    val nama: String?,
    val asma: String?,
    val arti: String?,
    val ayat: Int,
    val type: String?,
    val nomor: Int,
    val audio: String?,
    val urut: Int,
    val keterangan: String?,

    @SerializedName("rukuk")
    val text: Int
)