package com.example.composelessongsn

import android.graphics.pdf.models.ListItem
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelessongsn.ui.theme.ComposeLessonGSNTheme
import org.w3c.dom.NameList
import javax.xml.namespace.QName

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLessonGSNTheme {
                Scaffold(modifier = Modifier.fillMaxSize()
                    .padding(top = 10.dp)) { innerPadding ->
                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                        listitem(innerPadding, name = "Zac Efron", prof = "Actor")
                    }
                }
            }
        }
    }
}

@Composable
private fun listitem(padding: PaddingValues, name: String, prof: String) {
    var counter = remember {
        mutableStateOf(0)
    }



    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .clickable {
            counter.value++


    },

        shape = RoundedCornerShape( size = 15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)){
        Box(){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(painter = painterResource(id = R.drawable.image),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(64.dp)
                        .padding(5.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = counter.value.toString())
                    Text(text = prof)

                }
            }
        }
    }
}



