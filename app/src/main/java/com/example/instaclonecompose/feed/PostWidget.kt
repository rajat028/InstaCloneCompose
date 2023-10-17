package com.example.instaclonecompose.feed

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instaclonecompose.R
import com.example.instaclonecompose.model.User

@Composable
fun PostWidget(user: User) {
    
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = user.profilePic, contentDescription = "Profile Pic",
                    Modifier
                        .clip(CircleShape)
                        .size(40.dp)
                )
                Spacer(Modifier.width(10.dp))
                Column {
                    Text(text = user.userName, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                    Text(text = user.location, fontSize = 14.sp)
                }
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_more),
                    contentDescription = "More"
                )
            }
        }
        
        Image(
            painter = user.postPic,
            contentDescription = "Post Pic",
            Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            
            Row {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_like_outline),
                        contentDescription = "Like",
                        tint = Color.Black,
                        modifier = Modifier.size(25.dp)
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_comment),
                        contentDescription = "Comment",
                        tint = Color.Black,
                        modifier = Modifier.size(30.dp)
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_send),
                        contentDescription = "Send",
                        tint = Color.Black,
                        modifier = Modifier.size(23.dp)
                    )
                }
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_save),
                    contentDescription = "Save Post",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }
        }
        
        Column(Modifier.padding(horizontal = 16.dp)) {
            Text(text = "${user.likeCount} likes")
            Text(text = buildAnnotatedString {
                append(
                    AnnotatedString(
                        text = "${user.userName} ",
                        spanStyle = SpanStyle(fontWeight = FontWeight.Bold)
                    )
                )
                append(user.caption)
            })
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "${user.commentCount} comments", color = Color.DarkGray, fontSize = 13.sp)
        }
    }
}

@Composable
@Preview
fun PostWidgetPreview() {
    PostWidget(
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