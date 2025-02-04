package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val userName = intent.getStringExtra("USER_NAME") ?: ""
        val userBirthYear = intent.getStringExtra("USER_BIRTH_YEAR") ?: ""
        val userAge = AgeCalculator.calculateAge(userBirthYear.toInt())

        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
                        PresentationScreen(userName, userAge)
                    }
                }
            }
        }
    }
}
@Composable
fun PresentationScreen(userName: String, userAge: Int) {

    Text("Hello $userName vous avez $userAge ans !", textAlign = TextAlign.Center)
}
