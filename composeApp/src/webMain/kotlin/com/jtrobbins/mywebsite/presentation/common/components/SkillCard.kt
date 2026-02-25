package com.jtrobbins.mywebsite.presentation.common.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun  SkillCard(
    category: String,
    skills: List<String>
) {
    val scrollState = rememberScrollState()
    CustomCard {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .horizontalScroll(scrollState),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = category,
                modifier = Modifier.padding(end = 16.dp)
            )
            skills.forEach { skill ->
                Card(
                    modifier = Modifier.padding(end = 16.dp)
                ) {
                    Text(
                        text = skill,
                        modifier = Modifier.padding(6.dp)
                    )
                }
            }
        }
    }
}