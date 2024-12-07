package com.example.mviejemplo.presentacion

sealed class ClimaEstado {
    data object Vacio:ClimaEstado()
    data object Cargando:ClimaEstado()
    data class Exitoso(val clima:Clima):ClimaEstado()
    data class Error(val mensaje:String):ClimaEstado()
}

//MODELO EN CAPA DE DATOS
data class Clima(
    val temperatura:Double,
    val sensacionTermica:Double,
    val estado:String,
    val humedad:Double,
    val velocidadDelViento:Double,
    val latitud:Double,
    val longitud:Double

    )
