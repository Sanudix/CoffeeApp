package com.example.coffeeapp.ui.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R

@Composable
fun CategorySectionItems(
    title: String,
    containerColor: Color,
    contentColor: Color
){
    Box(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(12.dp))
            .background(containerColor),

        ){
        Text(
            text = title,
            modifier = Modifier.padding(vertical = 9.dp, horizontal = 16.dp),
            fontSize = 15.sp,
            fontFamily = FontFamily(Font(R.font.sora)),
            color = contentColor,
            fontWeight = FontWeight.SemiBold,
        )
    }
}