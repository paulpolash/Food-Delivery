package com.example.fooddelivery.ui.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.theme.AppTheme

@Composable
fun ProductDescriptionSection(
    modifier: Modifier=Modifier,
    productDescription: String
){
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(11.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Description",
            style = AppTheme.typography.titleLarge,
            color = AppTheme.colors.onBackground,
            )

        Text(text = productDescription,
            style = AppTheme.typography.body,
            color = AppTheme.colors.onBackground,
            textAlign = TextAlign.Justify,
            modifier = Modifier.fillMaxSize()
        )

    }
}