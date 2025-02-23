package com.example.learnandteach360.presentation.screens.autn

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnandteach360.R

@Composable
fun SignUpScreen(
    navigateToDashbored: () -> Unit
) {

    val otpLength = 4
    val otpValues = remember { mutableStateListOf("", "", "", "") }
    val focusRequesters = List(otpLength) { FocusRequester() }


    Box(modifier = Modifier.fillMaxSize().padding(10.dp), contentAlignment = Alignment.Center){

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Image(
                painter = painterResource(id = R.drawable.app_icon),
                contentDescription = "App icon",
                modifier = Modifier
                    .height(130.dp)
                    .height(130.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                for (i in 0 until otpLength) {
                    TextField(
                        value = otpValues[i],
                        onValueChange = { value ->
                            if (value.length <= 1 && value.all { it.isDigit() }) {
                                otpValues[i] = value
                                if (value.isNotEmpty() && i < otpLength - 1) {
                                    focusRequesters[i + 1].requestFocus()
                                }
                            }
                        },
                        modifier = Modifier
                            .size(50.dp) // Square-shaped input field
                            .focusRequester(focusRequesters[i])
                            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp)),
                        textStyle = TextStyle(
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.width(8.dp)) // Space between input fields
                }
            }


        }

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
            Button(
                onClick = { navigateToDashbored() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.button_orange),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {

                Text(
                    text = "Continue",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                )

            }
        }
    }
}