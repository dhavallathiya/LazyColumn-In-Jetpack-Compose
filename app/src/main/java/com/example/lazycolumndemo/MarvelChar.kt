package com.example.lazycolumndemo

data class MarvelChar(
    val name: String,
    val charName: String,
    val imageRes: Int
)

fun getAllMarvelChar() : List<MarvelChar>{
    return listOf<MarvelChar>(
        MarvelChar("Tony Stark", "Iron Man", R.drawable.ironman),
        MarvelChar("Steve Rogers", "Captain America", R.drawable.captain),
        MarvelChar("Bruce Banner", "Hulk", R.drawable.hulk),
        MarvelChar("Thor Odinson", "Thor", R.drawable.tthor),
        MarvelChar("Natasha Romanoff", "Black Widow", R.drawable.black_widow),
        MarvelChar("Clint Barton", "Hawkeye", R.drawable.hawkeye),
        MarvelChar("Peter Parker", "Spider-Man", R.drawable.spiderman),
        MarvelChar("Stephen Strange", "Doctor Strange", R.drawable.doctorstrange),
        MarvelChar("T'Challa", "Black Panther", R.drawable.blackpanther),
        MarvelChar("Scott Lang", "Ant-Man", R.drawable.antman),
        MarvelChar("Wanda Maximoff", "Scarlet Witch", R.drawable.scarletwitch),
        MarvelChar("Vision", "Vision", R.drawable.vision),
        MarvelChar("Sam Wilson", "Falcon", R.drawable.falcon)
    )
}
