package com.example.instaclonecompose.feed

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instaclonecompose.R

@Composable
fun BottomBar() {
    BottomAppBar(backgroundColor = Color.White) {
        BottomNavigationItem(selected = true, onClick = { /*TODO*/ }, icon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_home_filled),
                modifier = Modifier.size(48.dp),
                contentDescription = "Home",
            )
        })
        
        BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                modifier = Modifier.size(48.dp),
                contentDescription = "Search",
            )
        })
        
        BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_reels_outline),
                modifier = Modifier.size(48.dp),
                contentDescription = "Reels",
            )
        })
        
        BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_like_outline),
                modifier = Modifier.size(48.dp),
                contentDescription = "Activity",
            )
        })
        
        BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(
                painter = painterResource(id = R.drawable.jon_snow),
                contentDescription = "Profile",
                Modifier
                    .clip(CircleShape)
                    .size(48.dp)
            )
        })
    }
}

/*
*IconButton(onClick = { /* do something */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_home_filled),
                contentDescription = "Home",
            )
        }
        IconButton(onClick = { /* do something */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "Search",
            )
        }
        IconButton(onClick = { /* do something */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_reels_outline),
                contentDescription = "Reels",
            )
        }
        IconButton(onClick = { /* do something */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_like_outline),
                contentDescription = "Activities",
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.jon_snow),
            contentDescription = "Profile",
            Modifier.size(30.dp).clip(CircleShape)
        )
* */

@Preview
@Composable
fun BottomBarPreview() {
    BottomBar()
}