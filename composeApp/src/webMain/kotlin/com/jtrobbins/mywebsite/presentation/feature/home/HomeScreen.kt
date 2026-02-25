package com.jtrobbins.mywebsite.presentation.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jtrobbins.mywebsite.presentation.common.components.CategoryItem
import com.jtrobbins.mywebsite.presentation.common.components.DescriptionCard
import com.jtrobbins.mywebsite.presentation.common.components.Footer

@Composable
fun HomeScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        CategoryItem(title = null) {
            DescriptionCard(
                description = "Full-Stack Software Developer\n" +
                        "Building robust applications and user experiences across frameworks and languages."
            )
        }
        Footer()
    }
}