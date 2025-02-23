package com.example.learnandteach360.presentation.screens.dashbord.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnandteach360.R

@Composable
fun HomeScreen(
    navigateToLearnScreen : () -> Unit,
    navigateToTeachScreen : () -> Unit
) {


    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 30.dp, horizontal = 20.dp),
    ) {

        Text(
            text = "Welcome To",
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.None,
            fontSize = 40.sp,
            modifier = Modifier.align(Alignment.Start   )
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Learn & Teach",
            textDecoration = TextDecoration.None,
            fontSize = 40.sp
        )

        Spacer(modifier = Modifier.height(35.dp))

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color = colorResource(id = R.color.button_orange))
            .clickable { navigateToLearnScreen() },
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Learn",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 25.sp
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color = colorResource(id = R.color.button_blue))
            .clickable { navigateToTeachScreen() },
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Teach",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 25.sp
            )
        }
        Spacer(modifier = Modifier.height(25.dp))

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color = colorResource(id = R.color.button_red)),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Mentor",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 25.sp
            )
        }

//        Button(onClick = {  }) {
//            Text(text = "Go to Login")
//        }

    }
}

//@Preview(showBackground = true)
//@Composable
//private fun HomePreview() {
//    HomeScreen()
//}