package com.example.learnandteach360.presentation.screens.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.learnandteach360.R
import com.example.learnandteach360.presentation.Navigation.endpoints.LearnScreenRoute
import com.example.learnandteach360.presentation.screens.dashbord.home.learn.LearnBaseScreen

@Composable
fun TopAppBar(
    navController: NavController,
    selectedScreen : String,
    onSelectScreen : (String) -> Unit
) {


    val unselectedButton = ButtonDefaults.buttonColors(
        containerColor = Color.LightGray,
        contentColor = Color.Black
    )
    
    val selecteedButton = ButtonDefaults.buttonColors(
        containerColor = colorResource(id = R.color.button_orange),
        contentColor = Color.White
    )

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.LightGray),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        Button(
            onClick = {
                navController.navigate(LearnScreenRoute.OnlineProgram.route)
                onSelectScreen(LearnScreenRoute.OnlineProgram.route)
            },
            colors = if(selectedScreen == LearnScreenRoute.OnlineProgram.route) selecteedButton else unselectedButton,
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Online Program", fontWeight = FontWeight.Bold, fontSize = 10.sp)
        }

        Button(
            onClick = {
                navController.navigate(LearnScreenRoute.OfflineProgram.route)
                onSelectScreen(LearnScreenRoute.OfflineProgram.route)
            },
            colors = if(selectedScreen == LearnScreenRoute.OfflineProgram.route) selecteedButton else unselectedButton,
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Offline Program", fontWeight = FontWeight.Bold, fontSize = 10.sp)
        }

        Button(
            onClick = {
                navController.navigate(LearnScreenRoute.Courses.route)
                onSelectScreen(LearnScreenRoute.Courses.route)
            },
            colors = if(selectedScreen == LearnScreenRoute.Courses.route) selecteedButton else unselectedButton,
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Courses", fontWeight = FontWeight.Bold, fontSize = 10.sp)
        }



    }
}