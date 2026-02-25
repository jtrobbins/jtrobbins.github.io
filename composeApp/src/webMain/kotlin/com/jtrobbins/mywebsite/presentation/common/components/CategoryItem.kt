package com.jtrobbins.mywebsite.presentation.common.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CategoryItem(title: String?, content: @Composable () -> Unit) {
    if (title != null) {
        Text(
            text = title,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
    content()
    HorizontalDivider(
        modifier = Modifier.padding(vertical = 8.dp),
        thickness = DividerDefaults.Thickness,
        color = DividerDefaults.color
    )
}