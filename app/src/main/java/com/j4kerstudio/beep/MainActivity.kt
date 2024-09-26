package com.j4kerstudio.beep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.j4kerstudio.beep.presentation.component.NavBar
import com.j4kerstudio.beep.presentation.screen.ConnectScreen
import com.j4kerstudio.beep.presentation.screen.SplashScreen
import com.j4kerstudio.beep.ui.theme.BeepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BeepTheme {
                    ConnectScreen()
            }
        }
    }
}
