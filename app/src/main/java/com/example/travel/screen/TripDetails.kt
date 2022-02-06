package com.example.travel.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travel.R
import com.example.travel.component.*
import com.example.travel.ui.theme.recyclerviewEndPadding
import com.example.travel.ui.theme.recyclerviewStartPadding

@Preview
@Composable
fun MainTripDetailsList() {
    Column {
        PageTitleAndIcon(text = "Trip Details", R.drawable.ic_back_arrow)
        Box(modifier = Modifier.padding(start = recyclerviewStartPadding, top = 15.dp)){
            PageTitle(text = "Copenhagen, Denmark", 22)
        }
        Box(modifier = Modifier.padding(top = 60.dp)){
            TripImages()
        }
        Box(modifier = Modifier.padding(start = recyclerviewStartPadding, top = 20.dp, bottom = 20.dp)){
            Column {
                PageTitle(text = "My First Visit To Copenhagen", fontSize = 22)
                GrayText(text = "Duis vestibulum elit - vel 2019", fontSize = 16)
            }
        }

        Box(modifier = Modifier.padding(start = recyclerviewStartPadding, end = recyclerviewStartPadding)){
            GrayText(text = "Duis vestibulum elit vel neque pharetra vulputate. Quisque scelerisque nisi urna. Duis rutrum non risus in imperdiet.", fontSize = 16)

        }
        Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 20.dp), contentAlignment = Alignment.Center){
            RoundedImage(width = 318, height = 129)
        }
        Box(modifier = Modifier.padding(start = recyclerviewStartPadding, end = recyclerviewStartPadding)) {
            GrayText(text = "Proin molestie accumsan nulla sit amet mattis. Ut vel tristique neque. Praesent purus eros, aliquet sit amet venenatis in, sodales in odio. Curabitur ac ligula et purus cursus vulputate accumsan sit amet erat. Vestibulum ac mauris ut nisl maximus porta eu a libero. In hac habitasse platea dictumst. Proin augue urna, pretium vel mauris sed, lobortis rutrum libero.", fontSize = 16)
        }
    }


}

@Composable
fun TripImages() {
    LazyRow(Modifier.padding(start = recyclerviewStartPadding)) {
        items(items = messages) {
            Box(Modifier.padding(end = 10.dp)) {
                RoundedImage(resource = R.drawable.friends, height = 77, width = 149)
            }
        }
    }
}