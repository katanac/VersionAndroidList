package com.example.listversionsandroidcompose

data class AndroidVersion(val versionName: String, val anioVersion: String, val image: Int)

fun getAndroidVersions(): List<AndroidVersion> {
    return listOf(
        AndroidVersion("ANDROID 1.0", "2008", R.drawable.uno),
        AndroidVersion("ANDROID CUPCAKE", "2009", R.drawable.dos),
        AndroidVersion("ANDROID DONUT", "2009", R.drawable.tres),
        AndroidVersion("ANDROID ECLAIR", "2009", R.drawable.cuatro),
        AndroidVersion("ANDROID FROYO", "2010", R.drawable.cinco),
        AndroidVersion("ANDROID GINGER", "2010", R.drawable.seis),
        AndroidVersion("ANDROID HONEYCOMB", "2011", R.drawable.siete),
        AndroidVersion("ANDROID ICE CREAM ", "2011", R.drawable.ocho),
        AndroidVersion("ANDROID JELLY BEAN", "2012", R.drawable.nueve),
        AndroidVersion("ANDROID KITKAT", "2013", R.drawable.diez),
        AndroidVersion("ANDROID LOLLIPOP", "2014", R.drawable.jectpack),

        )
}