package com.j4kerstudio.beep.presentation.screen

import android.window.SplashScreen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier.fillMaxSize(1f)
    ) {

    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}