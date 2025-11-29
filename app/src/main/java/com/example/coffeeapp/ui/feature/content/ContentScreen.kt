package com.example.coffeeapp.ui.feature.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun ContentScreen(onBack: () -> Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color.White)
    ) {
        ContentHeader(onBack = onBack)
        DescriptionSection()
        PriceBar()
    }
}