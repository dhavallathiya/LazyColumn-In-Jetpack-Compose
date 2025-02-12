package com.example.lazycolumndemo

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListDemo() {
    LazyListDemo()
}

@Composable
fun LazyListDemo() {
    var myList = getAllMarvelChar()
    LazyColumn(content = {
        itemsIndexed(myList, itemContent = { index, item ->
            MarvelItem(item)
        })
    })
}

@Composable
fun MarvelItem(item: MarvelChar) {
    val context = LocalContext.current
    Row(Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .clickable {
            Toast.makeText(context, "Clicked ${item.charName}", Toast.LENGTH_SHORT).show()
        }
    ) {
        Image(
            painterResource(item.imageRes),
            contentDescription = item.name,
            Modifier
                .clip(CircleShape)
                .size(64.dp)
                .scale(1.50f)
        )

        Column(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = item.charName,
                style = TextStyle(fontSize = 22.sp),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = item.name,
                style = TextStyle(fontSize = 18.sp),)
        }
    }
}