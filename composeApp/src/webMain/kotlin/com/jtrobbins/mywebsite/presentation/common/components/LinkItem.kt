package com.jtrobbins.mywebsite.presentation.common.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import kotlinx.browser.window

@Composable
fun LinkItem(text: String, url: String) {
    Text(
        text = text,
        textDecoration = TextDecoration.Underline,
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 16.dp)
            .clickable {
            window.open(url,"_blank")
        },
        color = MaterialTheme.colorScheme.primary
    )
}