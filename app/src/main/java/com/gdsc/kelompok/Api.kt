package com.gdsc.kelompok

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("data.json?print=pretty")
    fun getPosts(): Call<ArrayList<PostResponse>>
}