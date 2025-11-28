package com.example.coffeeapp.ui.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeapp.R

@Composable
@Preview
fun BottomNavBar(modifier: Modifier = Modifier){
    BottomAppBar(
        containerColor = Color.White,
        contentPadding = PaddingValues(horizontal = 24.dp),
        tonalElevation = 0.dp
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(80.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painterResource(R.drawable.ic_home),
                contentDescription = null,
                tint = Color(0xffE27D19)
            )
            Icon(
                painterResource(R.drawable.ic_favourites),
                contentDescription = null,
                tint = Color(0xffB7B7B7)
            )
            Icon(
                painterResource(R.drawable.ic_basket),
                contentDescription = null,
            )
            Icon(
                painterResource(R.drawable.ic_notification),
                contentDescription = null,
                tint = Color(0xffB7B7B7)
            )
        }
    }
}