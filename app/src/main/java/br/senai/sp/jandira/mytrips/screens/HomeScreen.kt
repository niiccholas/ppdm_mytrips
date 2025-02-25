package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.mytrips.R

@Composable
fun Homescreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF171923))
    ){
        Card(
            colors = CardDefaults.cardColors(
                Color(0xFF1B3A9B)
            ),
            modifier = Modifier
                .height(40.dp)
                .width(115.dp)
                .align(Alignment.TopEnd),
            shape = RoundedCornerShape(bottomStart = 15.dp),

        ){}
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
        ){
            Column {
                Text(
                    text = stringResource(R.string.login) //esperar um pouquinho se nao o R nao aparece
                )
            }
        }
        Card(
            colors = CardDefaults.cardColors(
                Color(0xFF1B3A9B)
            ),
            modifier = Modifier
                .height(40.dp)
                .width(115.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(topEnd = 15.dp),

            ){}
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomescreenPreview () {
    Homescreen()
}