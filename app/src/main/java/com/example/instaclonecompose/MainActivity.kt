package com.example.instaclonecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.instaclonecompose.feed.MainFeedScreen
import com.example.instaclonecompose.ui.theme.InstaCloneComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstaCloneComposeTheme {
                MainFeedScreen()
            }
        }
    }
}
