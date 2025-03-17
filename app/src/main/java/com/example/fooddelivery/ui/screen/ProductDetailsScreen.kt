package com.example.fooddelivery.ui.screen

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.data.ProductFlavorData
import com.example.fooddelivery.data.ProductFlavorState
import com.example.fooddelivery.data.ProductNutritionData
import com.example.fooddelivery.data.ProductNutritionState
import com.example.fooddelivery.data.ProductPreviewState
import com.example.fooddelivery.ui.screen.components.FlavorSection
import com.example.fooddelivery.ui.screen.components.ProductNutritionSection
import com.example.fooddelivery.ui.screen.components.ProductPreviewSection

@Composable
@Preview
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState(),
    productFlavors: List<ProductFlavorState> = ProductFlavorData,
    productNutritionState: ProductNutritionState = ProductNutritionData
) {
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier.verticalScroll(scrollableState)) {
        ProductPreviewSection(
            state = productPreviewState
        )
        Spacer(modifier = Modifier.height(16.dp)
        )
        FlavorSection(
            modifier = Modifier.padding(18.dp),
            data = productFlavors
        )
        Spacer(modifier = Modifier.height(16.dp)
        )
        ProductNutritionSection(
            modifier = Modifier.padding(horizontal = 18.dp),
            state = productNutritionState//42.55
        )
    }
}