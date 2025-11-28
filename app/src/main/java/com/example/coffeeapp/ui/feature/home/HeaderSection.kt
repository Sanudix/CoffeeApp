package com.example.coffeeapp.ui.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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
fun HeaderSection() {
    val gradient = Brush.horizontalGradient(
        listOf(Color(0xe0313131), Color(0xff131313))
    )

    Column {
        Box {
            Box(
                modifier = Modifier
                    .height(170.dp)
                    .fillMaxWidth()
                    .background(gradient)
            ) {
                Row(modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) {
                    Column {
                        Text(
                            text = "Location",
                            modifier = Modifier.padding(start = 16.dp, top = 50.dp),
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.sora)),
                            color = Color(0xffB7B7B7),
                            fontWeight = FontWeight.Normal,
                        )
                        Row(
                            modifier = Modifier.padding(top = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "West, Balurghat",
                                modifier = Modifier.padding(start = 16.dp),
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.sora)),
                                color = Color(0xffDDDDDD),
                                fontWeight = FontWeight.Normal,
                            )
                            Icon(
                                Icons.Filled.ArrowDropDown,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(22.dp)
                                    .padding(start = 2.dp),
                                tint = Color(0xffDDDDDD)
                            )
                        }
                    }
                    Spacer(Modifier.weight(1f))
                    Image(
                        painter = painterResource(R.drawable.image_profile_picture),
                        contentDescription = null,
                        Modifier
                            .padding(end = 20.dp)
                            .size(46.dp)
                            .align(Alignment.Bottom)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 144.dp)
            ) {
                SearchSection()
            }
        }
        CategorySection()
    }
}