package com.example.listversionsandroidcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyTemplateList(versionsAndroid: List<AndroidVersion>) {
    Image(
        painterResource(id = R.drawable.jectpack)  , contentDescription ="jetpack",
        Modifier
            .fillMaxWidth()
            .fillMaxSize() )

    LazyColumn(Modifier.padding(15.dp)) {
        items(versionsAndroid) { item ->
            MyMoleculeComponent(item)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}


@Composable
fun MyMoleculeComponent(versionAndroid: AndroidVersion) {
    Row(
        Modifier
            .background(MaterialTheme.colors.onBackground)
            .padding(1.dp)
            .border(2.dp, MaterialTheme.colors.primaryVariant, RoundedCornerShape(10.dp))
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        MyAtomImage(
            image = versionAndroid.image, labelText = "version 1",
            Modifier
                .padding(14.dp)
                .border(
                    BorderStroke(2.dp, MaterialTheme.colors.primaryVariant),
                    CircleShape
                )
                .background(
                    MaterialTheme.colors.surface
                )
                .padding(10.dp)
                .size(70.dp)
        )
        MyMoleculeTextColum(versionAndroid)

    }

}


@Composable
fun MyMoleculeTextColum(version: AndroidVersion) {
    Column(modifier = Modifier.padding(15.dp)) {
        MyAtomText(
            labelText = version.versionName,
            MaterialTheme.colors.onSurface,
            MaterialTheme.typography.button,
            FontWeight.ExtraBold,
            20.sp
        )

        Spacer(modifier = Modifier.height(15.dp))

        MyAtomText(
            labelText = version.anioVersion,
            MaterialTheme.colors.onSurface,
            MaterialTheme.typography.overline,
            FontWeight.SemiBold,
            15.sp
        )

        Spacer(modifier = Modifier.height(5.dp))
    }

}

@Composable
fun MyAtomText(
    labelText: String,
    colorText: Color,
    style: TextStyle,
    fontWeight: FontWeight?,
    fontSize: TextUnit
) {
    Text(labelText, color = colorText, style = style, fontSize = fontSize, fontWeight = fontWeight)
}

@Composable
fun MyAtomImage(image: Int, labelText: String, modifier: Modifier) {
    Image(
        painterResource(id = image), labelText, modifier = modifier
    )
}
