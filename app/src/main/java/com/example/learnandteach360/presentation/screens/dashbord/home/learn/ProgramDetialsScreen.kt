package com.example.learnandteach360.presentation.screens.dashbord.home.learn

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.learnandteach360.R
import com.example.learnandteach360.presentation.screens.dashbord.home.learn.componests.ProgramCardData

@Composable
fun ProgramDetailScreen(
    item : ProgramCardData = ProgramCardData(programName = "Concept Of Physics", programSubjects = "Mechanics,Modern Physics","30 Days","353"),
    navigateToRegistrationScreen : () -> Unit
) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = item.programName,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            color = Color.Black
        )
        
        Image(
            painter = painterResource(id = R.drawable.program_detials),
            contentDescription = "Program details" ,
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = { navigateToRegistrationScreen() },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = colorResource(id = R.color.button_orange)
            ),

        ) {
            
            Text(text = "Register Now", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
            
        }

    }
}