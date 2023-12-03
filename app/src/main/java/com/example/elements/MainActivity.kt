package com.example.elements

import android.os.Bundle
import androidx.compose.foundation.layout.Box
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.KeyboardType.Companion.Number
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//import androidx.compose.ui.text.input.KeyboardOptions
//import androidx.compose.ui.unit.dpToDp
import com.example.elements.ui.theme.ElementsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ElementsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyScreenWithBackground()
                }
            }
        }
    }
}
@Composable
fun MyScreenWithBackground() {
    val backgroundImage = painterResource(id = R.drawable.screen1_background)

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = backgroundImage,
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
//                .height(30.dp)
//                .padding(1.dp)
        )
        {
            Spacer(modifier = Modifier.height(486.dp))
            PhoneNumberInPutCard(modifier = Modifier
                .align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview
@Composable
fun MyScreenBackgroundPreview() {
    ElementsTheme {
        MyScreenWithBackground()
    }
}

@Composable
fun PhoneNumberInPutCard(modifier: Modifier = Modifier) {
    var inputText by remember { mutableStateOf("") }
    var inputValue by remember { mutableStateOf(0) }

    Surface (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
        ){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(215.dp)
//        elevation = CardDefaults.cardElevation(
//            defaultElevation = 6.dp
//        )
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(1.dp))

            TextField(
                value = inputText,
                onValueChange = {
                    inputText = it
                    inputValue = it.toIntOrNull() ?: 0
                },
                label = { Text(text = "[+254]") },
//                keyboardOptions = androidx.compose.ui.text.input.KeyboardOptions.Default.copy(keyboardType = Number),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    // handle the button click
                },
//                colors = ButtonConstants.defaultButtonColors(backgroundColor = Color.Yellow),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth(),
                content = {
                    Text(
                        text = "SEND",
                         // Set the text color of the button
                    )
                }
            )
        }
    }
    }

}