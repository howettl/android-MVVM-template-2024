package com.howettl.mvvmtemplate2024.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.howettl.mvvmtemplate2024.ui.theme.MvvmTemplate2024Theme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier, contentAlignment = Alignment.Center) {
        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    MvvmTemplate2024Theme {
        Greeting("Android")
    }
}