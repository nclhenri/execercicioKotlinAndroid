package com.senai.vsconnect_kotlin.apis


import com.google.gson.JsonObject
import com.senai.vsconnect_kotlin.models.Login
import com.senai.vsconnect_kotlin.models.Servico
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface EndPointInterface {
    @GET("servicos")
    fun listarServicos() : Call<List<Servico>>

    @POST("login")
    fun login(@Body usuario: Login) : Call<JsonObject>
}