package com.example.travel.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travel.R


@Preview
@Composable
fun CircleUserImage(image:Int = R.drawable.user) {
    Image(
        painter = painterResource(image),
        contentDescription = "avatar",
        contentScale = ContentScale.Crop,            // crop the image if it's not a square
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)                       // clip to the circle shape
            .border(2.dp, Color.White, CircleShape)   // add a border (optional)
    )
}

@Preview
@Composable
fun RoundedImage(resource: Int = R.drawable.city, height: Int = 245, width:Int = 101) {
    Card(
        shape = RoundedCornerShape(5.dp)) {
        Box(
            modifier = Modifier, contentAlignment = Alignment.TopCenter
        ) {
            GrayImage(resource, height = height, width = width)
        }
    }
}

@Composable
fun GrayImage(resource: Int = R.drawable.ic_mic, height: Int = 245, width:Int = 101) {
    val image: Painter = painterResource(id = resource)
    Image(contentScale = ContentScale.Crop, painter = image, contentDescription = "", modifier = Modifier.height(height.dp).width(width.dp))
}
