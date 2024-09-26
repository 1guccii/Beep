package com.j4kerstudio.beep.presentation.screen

import android.graphics.Color
import android.window.SplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.j4kerstudio.beep.ui.theme.Typography

@Composable
fun SplashScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(1f).background(androidx.compose.ui.graphics.Color.White)
    ) {
        Text(text = "Beep", style = Typography.displayLarge)
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}