package com.example.instaclonecompose.model

import androidx.compose.ui.graphics.painter.Painter

data class User (
    val profilePic: Painter,
    val postPic: Painter,
    val userName: String,
    val location: String,
    val caption: String,
    val likeCount: Int,
    val commentCount: Int
)