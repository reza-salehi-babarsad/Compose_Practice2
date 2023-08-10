package com.rezoo.compose_practice_addpic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rezoo.compose_practice_addpic.ui.theme.Compose_Practice_addPicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_Practice_addPicTheme {
                Greeting()

            }
        }
    }
}

@Composable
fun Greeting() {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.clip(RoundedCornerShape(8.dp))
                ,
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null
        )
        Text(

            text = "Reza"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_Practice_addPicTheme {
        Greeting()
    }
}