package com.example.retrofitlatihan.modul


data class PostResponse(
    val id_buku:String?,
    val kode_buku:String?,
    val judul_buku:String?,
    val penulis:String?,
    val penerbit:String?,
    val tahun_terbit:String?,
    val stok_buku:String?
)