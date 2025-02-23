package com.example.learnandteach360.presentation.screens.dashbord.home.teach

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.learnandteach360.presentation.Navigation.endpoints.LearnScreenRoute
import com.example.learnandteach360.presentation.Navigation.endpoints.TeachScreenRoute
import com.example.learnandteach360.presentation.screens.common.SearchBar
import com.example.learnandteach360.presentation.screens.common.TopAppBar
import com.example.learnandteach360.presentation.screens.dashbord.home.learn.LearnScreenNavigation
import com.example.learnandteach360.presentation.screens.dashbord.home.teach.components.TeachTopAppBar

@Composable
fun TeachBaseScreen() {

    val navController = rememberNavController()
    var selectedScreen by remember {
        mutableStateOf(TeachScreenRoute.ImplementingProgramScreen.route)
    }



    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp, horizontal = 10.dp)
    ) {

        TeachTopAppBar(
            navController = navController,
            selectedScreen = selectedScreen
        ) {
                newScreen -> selectedScreen = newScreen
        }

        Spacer(modifier = Modifier.height(10.dp))

        TeachScreenNavigation(navHostController = navController)

    }
}