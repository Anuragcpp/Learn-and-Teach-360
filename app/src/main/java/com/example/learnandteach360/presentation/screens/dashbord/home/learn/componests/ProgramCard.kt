package com.example.learnandteach360.presentation.screens.dashbord.home.learn.componests

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnandteach360.R

@Composable
fun ProgramCard(
    item : ProgramCardData,
    navigateToDetailsScreen : () -> Unit
) {
    
    
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clip(RoundedCornerShape(12.dp))
            .clickable { navigateToDetailsScreen() }
            ,
        elevation = CardDefaults.elevatedCardElevation(10.dp)
    ){

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp)) {
            Row (modifier = Modifier
                .fillMaxWidth())
            {

                Image(
                    painter = painterResource(id = R.drawable.program_image),
                    contentDescription = "program Image",
                    modifier = Modifier.height(80.dp).width(60.dp)

                )

                Spacer(modifier = Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = item.programName,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp,
                        color = Color.Black
                        )

                    Text(
                        text = item.programSubjects,
                        fontSize = 15.sp,
                        color = Color.Black
                    )

//                    Row {
//                        Text(
//                            text = "Mechanics",
//                            fontSize = 15.sp,
//                            color = Color.Black
//                        )
//
//                        Spacer(modifier = Modifier.width(10.dp))
//                        Text(
//                            text = "Modern Physics",
//                            fontSize = 15.sp,
//                            color = Color.Black
//                        )
//                        Spacer(modifier = Modifier.width(10.dp))
//                        Text(
//                            text = "Optics",
//                            fontSize = 15.sp,
//                            color = Color.Black
//                        )
//
//                    }

                    Text(
                        text = "${item.duration} program",
                        fontSize = 13.sp,
                        color = Color.Gray
                    )


                }

            }

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Row {
                    Text(
                        text = item.registered,
                        fontSize = 12.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = "Registered",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(alignment = Alignment.Bottom),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Green,
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Apply",
                        fontSize = 15.sp,
                    )
                }
            }
        }
        
    }
}


//@Preview(showBackground = true)
//@Composable
//private fun ProgramCardPreview() {
//    ProgramCard()
//}