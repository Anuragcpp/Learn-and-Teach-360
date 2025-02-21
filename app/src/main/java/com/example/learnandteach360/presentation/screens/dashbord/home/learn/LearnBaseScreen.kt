package com.example.learnandteach360.presentation.screens.dashbord.home.learn

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.learnandteach360.presentation.Navigation.endpoints.LearnScreenRoute
import com.example.learnandteach360.presentation.screens.common.SearchBar
import com.example.learnandteach360.presentation.screens.common.TopAppBar

@Composable
fun LearnBaseScreen(

) {

    val navController = rememberNavController()
    var selectedScreen by remember {
        mutableStateOf(LearnScreenRoute.OnlineProgram.route)
    }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp, horizontal = 10.dp)
    ) {

        var searchQuery by remember {
            mutableStateOf("")
        }

        SearchBar(
            query = searchQuery,
            oneSearchQuery = {searchQuery = it}
        )

        Spacer(modifier = Modifier.height(10.dp))

        TopAppBar(
            navController = navController,
            selectedScreen = selectedScreen
        ) {
            newScreen -> selectedScreen = newScreen
        }

        Spacer(modifier = Modifier.height(10.dp))

        LearnScreenNavigation(navController = navController)

    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewLearnBaseScreen() {
    LearnBaseScreen()
}