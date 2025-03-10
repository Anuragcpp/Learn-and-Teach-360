package com.example.learnandteach360.presentation.screens.dashbord.home.learn

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.learnandteach360.presentation.screens.dashbord.home.learn.componests.ProgramCard
import com.example.learnandteach360.presentation.screens.dashbord.home.learn.componests.ProgramCardData

@Composable
fun CoursesScreen(
    navigateToDetailsScreen : () -> Unit
) {
    val list = listOf(
        ProgramCardData(
            programName = "Concept Of Physics",
            programSubjects = "Mechanics,Modern Physics,Optics",
            duration = "30 days",
            registered = "1135"
        ),
        ProgramCardData(
            programName = "Concept Of Physics",
            programSubjects = "Mechanics,Modern Physics,Optics",
            duration = "30 days",
            registered = "1135"
        ),
        ProgramCardData(
            programName = "Concept Of Physics",
            programSubjects = "Mechanics,Modern Physics,Optics",
            duration = "30 days",
            registered = "1135"
        ),
        ProgramCardData(
            programName = "Concept Of Physics",
            programSubjects = "Mechanics,Modern Physics,Optics",
            duration = "30 days",
            registered = "1135"
        ),
        ProgramCardData(
            programName = "Concept Of Physics",
            programSubjects = "Mechanics,Modern Physics,Optics",
            duration = "30 days",
            registered = "1135"
        ),
        ProgramCardData(
            programName = "Concept Of Physics",
            programSubjects = "Mechanics,Modern Physics,Optics",
            duration = "30 days",
            registered = "1135"
        ),
        ProgramCardData(
            programName = "Concept Of Physics",
            programSubjects = "Mechanics,Modern Physics,Optics",
            duration = "30 days",
            registered = "1135"
        ),
        ProgramCardData(
            programName = "Concept Of Physics",
            programSubjects = "Mechanics,Modern Physics,Optics",
            duration = "30 days",
            registered = "1135"
        ),
    )
    LazyColumn(modifier = Modifier.fillMaxSize()){
        items(list){
                item -> ProgramCard(item, navigateToDetailsScreen = {navigateToDetailsScreen()})
        }
    }
}