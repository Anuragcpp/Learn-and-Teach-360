package com.example.learnandteach360.presentation.screens.dashbord.home.learn

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnandteach360.R

@Composable
fun RegistrationScreen(
) {

    var name by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var phoneNumber by remember {
        mutableStateOf("")
    }

    var schoolName by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .padding(10.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {


        OutlinedTextField(value = name, onValueChange = {name = it}, label = { Text(text = "Full Name")})
        
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = email, onValueChange = {email = it} , label = { Text(text = "Email Address")})

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = phoneNumber, onValueChange = {phoneNumber = it}, label = { Text(text = "Phone Number")})

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = schoolName, onValueChange = {schoolName = it}, label = { Text(text = "School Name")})

        Spacer(modifier = Modifier.height(10.dp))
        
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.button_orange),
                contentColor = Color.White
            )
        ) {
            Text(text = "Submit", fontWeight = FontWeight.SemiBold, fontSize = 15.sp)
        }

    }
}