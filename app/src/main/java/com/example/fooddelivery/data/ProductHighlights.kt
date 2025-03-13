package com.example.fooddelivery.data

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProductHighlights(
    modifier: Modifier = Modifier,
    highlights: List<ProductHighlightState>
){
    Column {
        highlights.onEach { item->

        }
    }
}