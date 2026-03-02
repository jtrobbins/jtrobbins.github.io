package com.jtrobbins.mywebsite.presentation.common.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import kotlinx.browser.window
import mywebsite.composeapp.generated.resources.Res
import mywebsite.composeapp.generated.resources.download_file
import org.jetbrains.compose.resources.painterResource

@Composable
fun LinksRow() {
    CategoryItem(title = null) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
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
            IconButton(onClick = {
                window.open("https://raw.githubusercontent.com/jtrobbins/jtrobbins.github.io/refs/heads/main/pdf/jrobbins-resume.pdf","_blank")
            }) {
                Image(
                    painter = painterResource(Res.drawable.download_file),
                    contentDescription = "Download Resume",
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                )
            }
        }
    }
}