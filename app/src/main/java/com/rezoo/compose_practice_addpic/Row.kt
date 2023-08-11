package com.rezoo.compose_practice_addpic

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rezoo.compose_practice_addpic.ui.theme.Compose_Practice_addPicTheme

@Composable
fun SetRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Icon(painter = painterResource(id = R.drawable.baseline_3d_rotation_24), contentDescription = null)
        
    }

}

@Preview(showBackground = true)
@Composable
fun SetRowPreview() {
    Compose_Practice_addPicTheme {
        SetRow()
    }
    
}