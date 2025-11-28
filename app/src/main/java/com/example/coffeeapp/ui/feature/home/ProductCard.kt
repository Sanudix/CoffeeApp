package com.example.coffeeapp.ui.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
fun ProductCard() {
    Card(
        modifier = Modifier
            .padding(all = 8.dp)
            .fillMaxSize()
            .background(color = Color.White),
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .background(color = Color.White),
        ) {
            Image(
                painter = painterResource(R.drawable.image_coffee_1),
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxSize()
                    .heightIn(max = 150.dp),
                contentScale = ContentScale.Crop,
            )
            Text(
                text = "Cappucino",
                modifier = Modifier.padding(start = 16.dp, top = 8.dp),
                fontSize = 17.sp,
                fontFamily = FontFamily(Font(R.font.sora)),
                color = Color(0xff2F2D2C),
                fontWeight = FontWeight.SemiBold,
            )
            Text(
                text = "with Chocolate",
                modifier = Modifier.padding(start = 16.dp, top = 4.dp),
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.sora)),
                color = Color(0xff9B9B9B),
                fontWeight = FontWeight.Normal,
            )
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .background(color = Color.White),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$ 4.53",
                    fontSize = 19.sp,
                    fontFamily = FontFamily(Font(R.font.sora)),
                    color = Color(0xff2F4B4E),
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.weight(1f))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .size(32.dp)
                        .fillMaxSize()
                        .background(Color(0xffC67C4E)),

                ){
                    Icon(
                        painter = painterResource(R.drawable.ic_plus),
                        contentDescription = null,
                        modifier = Modifier
                            .background(Color.Transparent)
                            .align(Alignment.Center),
                        tint = Color.White,
                    )
                }
            }
        }
    }
}