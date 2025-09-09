package com.example.composelessongsn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import com.example.composelessongsn.ui.theme.ComposeLessonGSNTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLessonGSNTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    NewText(innerPadding)
                }
            }
        }
    }
}

@Composable
fun NewText(padding: PaddingValues) {
    Row(
        modifier = Modifier. background(Color.Gray) .padding(paddingValues = padding).fillMaxWidth() .fillMaxHeight(fraction = 1F), horizontalArrangement = Arrangement.SpaceEvenly){

    Column (
        modifier = Modifier.background(Color.Red)
            .fillMaxHeight(fraction = 0.5F)
        .fillMaxWidth(fraction = 0.5F),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Hello!")
        Text(text = "Arzamas!")
        Text(text = "Sarov!")
    }

    Column(
        modifier = Modifier.background(Color.Green)
            .fillMaxHeight(fraction = 0.5F)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Welcome!")
        Text(text = "To!")
        Text(text = "LPK!")
    }
  }
}

