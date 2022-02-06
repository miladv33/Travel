package com.example.travel.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travel.R
import com.example.travel.ui.theme.recyclerviewEndPadding
import com.example.travel.ui.theme.recyclerviewStartPadding


@Preview
@Composable
fun TowSeparateTextView(firstText: String = "Copenhagen, Denmark", secondText: String = "2019/12/01", firstFontSize: Int = 12, secondFontSize: Int = 10) {
    Column {
        Text(text = firstText, color = Color.White, fontSize = firstFontSize.sp)
        Text(text = secondText, color = Color.White, fontSize = secondFontSize.sp)
    }
}

@Preview
@Composable
fun TowlinesTitleTextView(text: String = "My First Visit to Copenhagen", size: Int = 150, fontSize: Int = 22) {
    Box(modifier = Modifier.width(size.dp)) {
        Text(
            text = text, fontWeight = FontWeight.Bold, color = Color.White, fontSize = fontSize.sp
        )
    }
}

@Preview
@Composable
fun RecyclerViewTitle() {
    Row(modifier = Modifier.fillMaxWidth().padding(bottom = 5.dp, top = 10.dp, start = recyclerviewStartPadding, end = recyclerviewEndPadding), verticalAlignment = Alignment.CenterVertically) {
        PageTitle(fontSize = 22)
        EndCenterText(color = colorResource(id = R.color.viewAllColor))
    }
}

@Composable
fun EndCenterText(text: String = "View All", size: Int = 14, color: Color) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.CenterEnd
    ) {
        Text(text = text, fontSize = size.sp, color = color)
    }
}

@Preview
@Composable
fun SearchShape() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(bottom = 5.dp, top = 10.dp, start = recyclerviewStartPadding, end = recyclerviewEndPadding),
        shape = RoundedCornerShape(50.dp),
        backgroundColor = colorResource(id = R.color.searchBackground),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(43.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.padding(start = 10.dp)) {
                GrayImage(R.drawable.ic_search, height = 20, width = 20)
            }
            Box(modifier = Modifier.padding(start = 10.dp)) {
                GrayText()
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 10.dp), contentAlignment = Alignment.CenterEnd
            ) {
                GrayImage(height = 19, width = 11)
            }
        }
    }
}


@Preview
@Composable
fun GrayText(text: String = "search", fontSize: Int = 20) {
    Text(text = text, fontSize = fontSize.sp, color = colorResource(id = R.color.grayTextColor))
}

@Preview
@Composable
fun PageTitleAndIcon(text: String = "Explore Cities", icon:Int = R.drawable.ic_main_title) {
    Row(modifier = Modifier.fillMaxWidth().padding(bottom = 5.dp, top = 10.dp, start = recyclerviewStartPadding, end = recyclerviewEndPadding), verticalAlignment = Alignment.CenterVertically) {
        PageTitle(text = text)
        PageTitleIcon(icon)
    }
}

@Composable
fun PageTitle(text: String = "Explore Cities", fontSize: Int = 30) {
    Text(
        text, textAlign = TextAlign.Start,
        fontWeight = FontWeight.Bold, fontSize = fontSize.sp, maxLines = 1
    )
}

@Composable
fun PageTitleIcon(resource: Int = R.drawable.ic_main_title) {
    val image: Painter = painterResource(id = resource)
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.CenterEnd
    ) {
        Image(
            modifier = Modifier
                .size(width = 24.dp, height = 18.dp),

            painter = image,
            alignment = Alignment.CenterStart,
            contentDescription = "contentDescription",
            contentScale = ContentScale.Crop,
        )
    }
}

@Preview
@Composable
fun MyTripTitle(icon: Int = R.drawable.ic_location) {
    Row {
        Box(modifier = Modifier.padding(end = 10.dp)){
            GrayImage(icon, width = 12, height = 19)
        }
        PageTitle(text = "Copenhagen, Denmark", fontSize = 18)
    }
}



