package com.hd.goaldigger.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hd.goaldigger.data.Priority

@Composable
fun PriorityItem(priority: Priority){
    Row(verticalAlignment = Alignment.CenterVertically){
        Canvas(modifier = Modifier.size(16.dp)) {
            drawCircle(color = priority.color)
        }

        Text(modifier =Modifier.padding(start = 12.dp),
            text = priority.name,
            color = Color.Black,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}

@Composable
@Preview
fun PriorityItemPreview(){
    PriorityItem(priority = Priority.HIGH)
}