package com.example.coffeeapp.ui.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun CategorySection(){
    LazyRow(
        contentPadding = PaddingValues(20.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item { CategorySectionItems("Cappucino", Color(0xffC67C4E), Color(0xffFFFFFF)) }
        item { CategorySectionItems("Mochiate", Color(0xffFFFFFF), Color(0xff2F4B4E)) }
        item { CategorySectionItems("Latte", Color(0xffFFFFFF), Color(0xff2F4B4E)) }
        item { CategorySectionItems("Americano", Color(0xffFFFFFF), Color(0xff2F4B4E)) }
    }
}