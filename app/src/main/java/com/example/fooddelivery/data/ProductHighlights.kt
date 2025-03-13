package com.example.fooddelivery.data

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.theme.AppTheme

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

@Composable
private fun Highlight(
    text: String
){
    Surface(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(percent = 50)
    ){
        Box(
            modifier = Modifier.padding(
                vertical = 10.dp,
                horizontal = 12.dp
            )
        ){
            Text(text = text,
                style = AppTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold)
        }
    }
}