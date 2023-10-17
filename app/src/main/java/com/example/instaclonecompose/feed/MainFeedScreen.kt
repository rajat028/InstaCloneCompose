package com.example.instaclonecompose.feed

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instaclonecompose.R
import com.example.instaclonecompose.model.User

@Composable
fun MainFeedScreen() {
    val users = listOf(
        User(
            profilePic = painterResource(id = R.drawable.jon_snow),
            postPic = painterResource(id = R.drawable.jon_snow_post),
            userName = "jon_snow",
            location = "USA, New Jersey",
            caption = "Hey its a test caption",
            likeCount = 437,
            commentCount = 43
        ),
        User(
            profilePic = painterResource(id = R.drawable.arya_stark),
            postPic = painterResource(id = R.drawable.arya_stark_post),
            userName = "arya_stark",
            location = "USA, New Jersey",
            caption = "Hey its a test caption",
            likeCount = 47,
            commentCount = 40
        ),
        User(
            profilePic = painterResource(id = R.drawable.daenerys_targaryen),
            postPic = painterResource(id = R.drawable.daenerys_targaryen),
            userName = "daenerys_targaryen",
            location = "USA, New Jersey",
            caption = "Hey its a test caption",
            likeCount = 47,
            commentCount = 40
        ),
        User(
            profilePic = painterResource(id = R.drawable.jorah_mormont),
            postPic = painterResource(id = R.drawable.jorah_mormont_post),
            userName = "jorah_mormont",
            location = "USA, New Jersey",
            caption = "Hey its a test caption",
            likeCount = 90,
            commentCount = 20
        ),
        User(
            profilePic = painterResource(id = R.drawable.sansa_stark),
            postPic = painterResource(id = R.drawable.sansa_stark_post),
            userName = "sansa_stark",
            location = "USA, New Jersey",
            caption = "Hey its a test caption",
            likeCount = 10,
            commentCount = 40
        ),
        User(
            profilePic = painterResource(id = R.drawable.rob_stark),
            postPic = painterResource(id = R.drawable.robb_stark_post),
            userName = "rob_stark",
            location = "USA, New Jersey",
            caption = "Hey its a test caption",
            likeCount = 19,
            commentCount = 20
        ),
        User(
            profilePic = painterResource(id = R.drawable.jorah_mormont),
            postPic = painterResource(id = R.drawable.jorah_mormont_post),
            userName = "jorah_mormont",
            location = "USA, New Jersey",
            caption = "Hey its a test caption",
            likeCount = 19,
            commentCount = 20
        ),
        User(
            profilePic = painterResource(id = R.drawable.tyrian_lannister),
            postPic = painterResource(id = R.drawable.tyrian_lannister_post),
            userName = "tyrian_lannister",
            location = "USA, New Jersey",
            caption = "Hey its a test caption",
            likeCount = 19,
            commentCount = 20
        ),
        User(
            profilePic = painterResource(id = R.drawable.bran_stark),
            postPic = painterResource(id = R.drawable.bran_stark_post),
            userName = "bran_stark",
            location = "USA, New Jersey",
            caption = "Hey its a test caption",
            likeCount = 19,
            commentCount = 20
        )
    )
    
    Scaffold(
        topBar = {
            TopBar()
        },
        bottomBar = {
            BottomBar()
        }
    ) { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            item {
                LazyRow {
                    items(users) { user ->
                        StoryWidget(user = user)
                    }
                }
            }
            item { Divider() }
            items(users) { user ->
                PostWidget(user = user)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Preview
@Composable
fun MainFeedScreenPreview() {
    MainFeedScreen()
}