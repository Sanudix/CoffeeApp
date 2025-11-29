package com.example.coffeeapp.ui.feature.content

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R

@Composable
@Preview
fun DescriptionSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .padding(horizontal = 20.dp)
            .background(Color.White),
    ) {
        Text(
            text = "Description",
            fontSize = 16.sp,
            color = Color.Black,
            fontFamily = FontFamily(Font(R.font.sora)),
            fontWeight = FontWeight.SemiBold,
        )
        Spacer(Modifier.padding(20.dp))
        Text(
            text = "A cappuccino is an approximately 150 ml (5 oz) \n" +
                    "beverage, with 25 ml of espresso coffee and\n" +
                    "85ml of fresh milk the fo.. Read More",
            fontSize = 14.sp,
            color = Color.Black,
            fontFamily = FontFamily(Font(R.font.sora)),
            fontWeight = FontWeight.Thin,
        )
        Spacer(Modifier.padding(20.dp))
        Text(
            text = "Size",
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.sora)),
            fontWeight = FontWeight.SemiBold,
        )
        Spacer(Modifier.padding(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .width(96.dp)
                    .height(43.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .border(
                        width = 1.dp,
                        color = Color(0xffDEDEDE),
                        shape = RoundedCornerShape(12.dp)
                    ),
            ) {
                Text(
                    text = "S",
                    modifier = Modifier
                        .align(Alignment.Center),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.sora)),
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                )
            }
            Box(
                modifier = Modifier
                    .width(96.dp)
                    .height(43.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xffFFF5EE))
                    .border(
                        width = 1.dp,
                        color = Color(0xffE27D19),
                        shape = RoundedCornerShape(12.dp)
                    ),
            ) {
                Text(
                    text = "M",
                    modifier = Modifier
                        .align(Alignment.Center),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.sora)),
                    color = Color(0xffE27D19),
                    fontWeight = FontWeight.SemiBold,
                )
            }
            Box(
                modifier = Modifier
                    .width(96.dp)
                    .height(43.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .border(
                        width = 1.dp,
                        color = Color(0xffDEDEDE),
                        shape = RoundedCornerShape(12.dp)
                    ),
            ) {
                Text(
                    text = "L",
                    modifier = Modifier
                        .align(Alignment.Center),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.sora)),
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                )
            }
        }
    }

}