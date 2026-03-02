package com.jtrobbins.mywebsite.presentation.common.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import kotlinx.browser.window

@Composable
fun PublicationCard(
    authors: String,
    title: String,
    publication: String,
    url: String
) {
    CustomCard {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {
            Text(
                text = authors,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Gray,
            )
            Text(
                text = publication,
                style = MaterialTheme.typography.bodyMedium,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .clickable {
                        window.open(url,"_blank")
                    },
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}