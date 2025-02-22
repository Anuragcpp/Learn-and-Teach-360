package com.example.learnandteach360.presentation.screens.dashbord.home.learn

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnandteach360.presentation.screens.dashbord.home.learn.componests.ProgramCard

@Composable
fun OfflineProgramScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()){
        ProgramCard()
        Spacer(modifier = Modifier.height(10.dp))
        ProgramCard()
        Spacer(modifier = Modifier.height(10.dp))
        ProgramCard()
        Spacer(modifier = Modifier.height(10.dp))
        ProgramCard()
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@Preview
@Composable
private fun OfflineProgramPreview() {
    OfflineProgramScreen()
}