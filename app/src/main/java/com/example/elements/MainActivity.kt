package com.example.elements

//import androidx.compose.ui.graphics
//import androidx.compose.ui.text.input.KeyboardOptions
//import androidx.compose.ui.unit.dpToDp
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.elements.ui.theme.ElementsTheme

//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

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
                    MyScreenWithBackground(context = this)
                }
            }
        }
    }
}
@Composable
fun MyScreenWithBackground(context: Context) {
    val backgroundImage = painterResource(id = R.drawable.background_login)

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

            var phoneNumberToCheck by remember { mutableStateOf("") }

            val context = LocalContext.current
            PhoneNumberInPutCard({ phoneNumber -> phoneNumberToCheck = phoneNumber},
            context = context
            )
        }
    }
}

@Preview
@Composable
fun MyScreenBackgroundPreview() {
    ElementsTheme {
        MyScreenWithBackground(context = this)
    }
}

data class User(val phoneNumber: String)

// Simulated database of registered phone numbers
val registeredUsers = listOf(
    User("1234567890"),
    User("9876543210"),
    User("5555555555")
)

@Composable
fun PhoneNumberInPutCard(onPhoneNumberEntered: (String) -> Unit, context: Context) {
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
                    onPhoneNumberEntered(inputText)
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
                    val isRegistered = isPhoneNumberRegistered("458433")

                    if (isRegistered) {
                        // Phone number is registered, navigate to HomeActivity
                        val intent = Intent(context, HomeActivity::class.java)
                        context.startActivity(intent)
                    } else {
                        // Phone number is not registered, navigate to RegistrationActivity
                        val intent = Intent(context, RegisterActivity::class.java)
                        context.startActivity(intent)
                    }

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

fun isPhoneNumberRegistered(phoneNumber: String): Boolean {

//    val phoneNumberToCheck = "1234567890" // Replace this with the phone number you want to check
//
//    val isRegistered = isPhoneNumberRegistered(phoneNumberToCheck)
//    if (isRegistered) {
//        println("$phoneNumberToCheck is registered.")
//    } else {
//        println("$phoneNumberToCheck is not registered.")
//    }

    return registeredUsers.any {it.phoneNumber == phoneNumber}
}