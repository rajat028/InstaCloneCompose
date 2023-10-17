package com.example.instaclonecompose.feed

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instaclonecompose.R
import com.example.instaclonecompose.model.User

@Composable
fun StoryWidget(user: User) {
    
    Box(
        modifier = Modifier.padding(8.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
        Canvas(modifier = Modifier.size(80.dp)) {
            drawCircle(
                brush = Brush.linearGradient(colors = instaColors),
                style = Stroke(width = 15f)
            )
        }
        
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = user.profilePic,
                contentDescription = "Profile Pic",
                Modifier
                    .clip(CircleShape)
                    .size(80.dp)
                    .border(width = 3.dp, color = Color.White, shape = CircleShape)
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = user.userName,
                color = Color.DarkGray,
                fontFamily = FontFamily(Font(R.font.robotocondensed))
            )
        }
    }
}

@Composable
@Preview
fun StoryWidgetPreview() {
    StoryWidget(
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
}