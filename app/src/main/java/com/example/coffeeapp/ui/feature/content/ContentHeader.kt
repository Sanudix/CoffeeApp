package com.example.coffeeapp.ui.feature.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun ContentHeader(onBack: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Column {
            Spacer(Modifier.padding(top = 14.dp))
            Image(
                painter = painterResource(R.drawable.image_detail_coffee),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 330.dp),
                alignment = Alignment.TopCenter
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Espresso Coffee",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontFamily = FontFamily(Font(R.font.sora)),
                        fontWeight = FontWeight.SemiBold,
                    )
                    Spacer(Modifier.padding(10.dp))
                    Text(
                        text = "with Chocolate",
                        fontSize = 12.sp,
                        color = Color.Black,
                        fontFamily = FontFamily(Font(R.font.sora)),
                        fontWeight = FontWeight.Normal,
                    )
                }
                Spacer(Modifier.weight(1f))
                Row(
                    modifier = Modifier.padding(start = 52.2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_star),
                        contentDescription = null,
                        tint = Color(0xffE27D19)
                    )
                    Text(
                        text = "4.5",
                        fontSize = 19.2.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily(Font(R.font.sora)),
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 4.8.dp)
                    )
                    Text(
                        text = "(2,330)",
                        fontSize = 14.4.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily(Font(R.font.sora)),
                        color = Color(0xff808080)
                    )
                }
            }
            Spacer(Modifier.padding(top = 22.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .padding(horizontal = 20.dp)
                    .background(Color(0xffEAEAEA))
            ) { }
        }
        TopBar(
            onBack = onBack,
            modifier = Modifier.fillMaxWidth().align(Alignment.TopCenter)
        )
    }
}