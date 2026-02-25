package com.jtrobbins.mywebsite.presentation.common.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PublicationCard(
    title: String,
    authors: String,
    publication: String
) {
    CustomCard {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
            )
            Text(
                text = authors,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = publication,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
        }
    }
}