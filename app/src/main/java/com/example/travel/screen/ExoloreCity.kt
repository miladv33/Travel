package com.example.travel.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travel.R
import com.example.travel.component.*
import com.example.travel.ui.theme.recyclerviewStartPadding

data class ListItem(val name: String)

val messages: List<ListItem> = arrayListOf(
    ListItem("1"),
    ListItem("2"),
    ListItem("3"),
    ListItem("4"),
    ListItem("5"),
    ListItem("6")
)

@Preview
@Composable
fun MainList() {
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
        items(1) {
            PageTitleAndIcon()
            SearchShape()
            PopularList()
            TrendingPlaceList()
            TravelWithYourFriend()
        }
    }
}

@Composable
fun PopularList() {
    Column {
        RecyclerViewTitle()
        LazyRow(Modifier.padding(start = recyclerviewStartPadding)) {
            items(items = messages) {
                PopularItem()
            }
        }
    }
}

@Composable
fun TrendingPlaceList() {
    Column {
        RecyclerViewTitle()
        LazyRow(Modifier.padding(start = recyclerviewStartPadding)) {
            items(items = messages) {
                Box(Modifier.padding(end = 10.dp)) {
                    RoundedImage(resource = R.drawable.friends, height = 77, width = 149)
                }
            }
        }
    }
}


@Preview
@Composable
fun PopularItem(imageSize: Int = 245) {
    Column(modifier = Modifier.padding(end = 10.dp)) {
        Box(modifier = Modifier.padding(top = 5.dp)) {
            RoundedImage(height = imageSize)
        }
        PageTitle(fontSize = 17)
        GrayText(fontSize = 11)
    }
}

@Composable
fun TravelWithYourFriend() {
    RecyclerViewTitle()
    LazyRow(Modifier.padding(start = recyclerviewStartPadding)) {
        items(items = messages) {
            Box(Modifier.padding(end = 10.dp)) {
                CircleUserImage()
            }
        }
    }
}