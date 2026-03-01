package com.jtrobbins.mywebsite.presentation.common.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LinksRow() {
    CategoryItem(title = null) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
        ) {
            LinkItem(
                text = "Email",
                url = "mailto:jeffrbns@gmail.com"
            )
            LinkItem(
                text = "GitHub",
                url = "https://github.com/jtrobbins/"
            )
            LinkItem(
                text = "LinkedIn",
                url = "https://linkedin.com/in/jeff-robbins-67904349/"
            )
        }
    }
}