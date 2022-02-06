package com.example.travel.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travel.R
import com.example.travel.component.*
import com.example.travel.ui.theme.recyclerviewStartPadding

@Preview
@Composable
fun MainMyTripList() {
    Column {
        PageTitleAndIcon(text = "My Trip", R.drawable.ic_back_arrow)
        LazyColumn() {
            items(5) {
                MyTripMainItem()
            }
        }
    }
}

@Composable
fun MyTripMainItem() {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp),modifier = Modifier.padding(start = recyclerviewStartPadding)) {
        MyTripTitle(icon = R.drawable.ic_location)
        MyTripImageView()
        Row(horizontalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier.padding(top = 10.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp),
                modifier = Modifier.padding(bottom = 10.dp)) {
                repeat(4) {
                    CircleUserImage()
                }
            }
            CircleUserImage(R.drawable.ic_plus)
        }
    }
}


@Composable
fun MyTripImageView() {
    Box {
        RoundedImage(resource = R.drawable.girl, height = 190, width = 320)
        Box(modifier = Modifier.padding(start = 10.dp, top = 10.dp)) {
            GrayImage(resource = R.drawable.ic_dots, width = 20, height = 4)
        }
        Column(modifier = Modifier
            .height(190.dp)
            .padding(start = 10.dp, bottom = 10.dp),
                horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Bottom) {
            TowlinesTitleTextView()
            TowSeparateTextView()
        }

    }
}