package com.example.mviejemplo.presentacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel

@Composable
fun ClimaPage(

) {
    val viewModel = ClimaViewModel()
    ClimaView(
        modifier = Modifier,
        estado = viewModel.estado
    ){
        viewModel.ejecutar(it)
    }
}