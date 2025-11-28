package com.example.coffeeapp.ui.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R

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