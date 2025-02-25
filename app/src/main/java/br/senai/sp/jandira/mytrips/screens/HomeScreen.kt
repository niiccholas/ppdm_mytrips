package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Homescreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF171923))
    ){

    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomescreenPreview () {
    Homescreen()
}