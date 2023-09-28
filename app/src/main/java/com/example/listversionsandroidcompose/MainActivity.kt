package com.example.listversionsandroidcompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.listversionsandroidcompose.ui.theme.ListVersionsAndroidComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListVersionsAndroidComposeTheme() {
                    MyTemplateList(getAndroidVersions())
            }

        }
    }
}


@Preview(showSystemUi = true)
@Preview(showSystemUi = true, showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    ListVersionsAndroidComposeTheme() {
        MyTemplateList(getAndroidVersions())
    }
}