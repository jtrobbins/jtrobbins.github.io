package com.jtrobbins.mywebsite.presentation.common.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AwardCard(
    name: String,
    granter: String,
    date: String,
    description: String,
) {
    CustomCard {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 16.dp)
                ) {
                    Text(
                        text = name,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = granter,
                        style = MaterialTheme.typography.bodyLarge,
                    )
                }

                Column(
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier.padding(horizontal = 16.dp),
                ) {
                    Text(
                        text = date,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
            Text(
                text = description,
                modifier = Modifier
                    .padding(horizontal = 16.dp),
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Gray
            )
        }
    }
}