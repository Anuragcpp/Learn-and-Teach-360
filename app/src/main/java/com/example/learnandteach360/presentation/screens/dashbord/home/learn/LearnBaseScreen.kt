package com.example.learnandteach360.presentation.screens.dashbord.home.learn

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnandteach360.presentation.screens.common.SearchBar

@Composable
fun LearnBaseScreen(modifier: Modifier = Modifier) {

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

    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewLearnBaseScreen() {
    LearnBaseScreen()
}