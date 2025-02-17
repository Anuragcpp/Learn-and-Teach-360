package com.example.learnandteach360.presentation.screens.autn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun SignUpScreen(
    navigateToSignInScreen : () -> Unit
) {


    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "SignUp Screen", fontWeight = FontWeight.Bold, textDecoration = TextDecoration.None)

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navigateToSignInScreen() }) {
            Text(text = "Go to Login")
        }


    }
}