package com.example.mviejemplo.presentacion

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ClimaViewModel {
    var estado by mutableStateOf<ClimaEstado>(ClimaEstado.Vacio)

    fun ejecutar(intencion: ClimaIntencion){
when(intencion){
    ClimaIntencion.actualiza -> actualizar()
}
    }

    private fun actualizar(){
        estado = ClimaEstado.Cargando
        //TODO conseguir los datos desde un repositorio
        estado = ClimaEstado.Error("No funciono el servidor, esta todo roto")
        
    }





}