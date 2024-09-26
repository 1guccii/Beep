package com.j4kerstudio.beep.presentation.screen

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.beep.R
import com.j4kerstudio.beep.presentation.component.NavBar
import com.j4kerstudio.beep.ui.theme.Typography

@Composable
fun ConnectScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Column(
            modifier = Modifier.weight(7f)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.frame),
                    "",
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Please scan the NFC card on your device",
                    style = Typography.bodyMedium,
                    modifier = Modifier.alpha(0.5f)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Read Manage",
                style = Typography.displayMedium,
                modifier = Modifier.padding(start = 32.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                TextButton(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier
                        .width(150.dp)
                        .height(66.dp)
                        .background(Color.Black)
                    ) {
                        Text(text = "Read History", style = Typography.labelLarge.copy(Color.White))
                }
                TextButton(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier
                        .width(150.dp)
                        .height(66.dp)
                        .background(Color.Black)
                ) {
                    Text(text = "Read History", style = Typography.labelLarge.copy(Color.White))
                }
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
        ) {
            NavBar()
        }
    }
}

@Preview
@Composable
fun ConnectScreenPreview() {
    ConnectScreen()
}