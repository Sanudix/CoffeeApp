package com.example.coffeeapp.ui.feature.content

import android.icu.text.NumberFormat
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeapp.R
import java.util.Locale

@Composable
fun PriceBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
            .height(50.dp)
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(Modifier.weight(1f)
        ) {
            Text(
                text = "Price",
                color = Color(0xff9B9B9B),
                fontFamily = FontFamily(Font(R.font.sora)),
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(Modifier.padding(4.dp))
            Text(
                text = "$" + NumberFormat
                    .getNumberInstance(Locale.US)
                    .format(4.53),
                color = Color(0xffE27D19),
                fontWeight = FontWeight.Bold,
                fontSize = 21.sp
            )
        }

        Button(
            onClick = {},
            modifier = Modifier.height(50.dp).width(200.dp),
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffE27D19),
                contentColor = colorResource(R.color.white)
            )
        ) {
            Text(
                text = "Buy Now",
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.sora)),
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
}

@Composable
@Preview
fun PriceBarPreview() {
    PriceBar()
}