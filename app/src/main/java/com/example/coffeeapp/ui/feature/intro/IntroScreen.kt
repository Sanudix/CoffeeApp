package com.example.coffeeapp.ui.feature.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R

@Preview
@Composable
fun IntroScreen(onClick: () -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff38241D))
    ) {
        Image(
            painter = painterResource(R.drawable.splash_screen_image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
        )
        Text(
            text = "Time for a coffee break....",
            fontFamily = FontFamily(Font(R.font.sora)),
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 27.dp, top = 22.dp, end = 43.dp),
            color = Color.White
        )
        Text(
            text = "Your daily dose of fresh brew delivered to\n" +
                    "your doorstep. Start your coffee journey now!",
            fontFamily = FontFamily(Font(R.font.roboto)),
            fontSize = 19.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 27.dp, top = 26.dp, end = 3.dp),
            color = Color.White
        )
        Image(
            painter = painterResource(R.drawable.ic_screens),
            contentDescription = null,
            modifier = Modifier
                .padding(horizontal = 160.dp)
                .padding(top = 62.dp, bottom = 39.dp)
                .align(Alignment.CenterHorizontally)
        )
        Button(
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .height(60.dp)
                .width(335.dp),
            shape = RoundedCornerShape(size = 30.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffE27D19),
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Get Started",
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.sora)),
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
}