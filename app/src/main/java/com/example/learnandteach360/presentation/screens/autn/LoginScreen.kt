package com.example.learnandteach360.presentation.screens.autn

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnandteach360.R

@Composable
fun LoginScreen(
    navigateToSignUp : () -> Unit,
) {

    var phone by remember {
        mutableStateOf("")
    }


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

            Text(
                text = "Learn & Teach",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(value = phone , onValueChange = {phone = it}, label = { Text(text = "Phone Number")} )


        }

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
            Button(
                onClick = { navigateToSignUp() },
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
                    text = "Next",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                )

            }
        }
    }
    

}