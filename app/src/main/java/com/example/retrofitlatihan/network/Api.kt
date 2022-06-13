package com.example.retrofitlatihan.network

import com.example.retrofitlatihan.modul.PostResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("read_buku.php")
    fun getPost(): Call<ArrayList<PostResponse>>
}