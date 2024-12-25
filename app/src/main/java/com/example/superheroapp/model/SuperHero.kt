package com.example.superheroapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.superheroapp.R

data class SuperHero(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)

val superHeroes = listOf(
    SuperHero(
        name = R.string.hero1,
        description = R.string.description1,
        image = R.drawable.android_superhero1
    ),
    SuperHero(
        name = R.string.hero2,
        description = R.string.description2,
        image = R.drawable.android_superhero2
    ),
    SuperHero(
        name = R.string.hero3,
        description = R.string.description3,
        image = R.drawable.android_superhero3
    ),
    SuperHero(
        name = R.string.hero4,
        description = R.string.description4,
        image = R.drawable.android_superhero4
    ),
    SuperHero(
        name = R.string.hero5,
        description = R.string.description5,
        image = R.drawable.android_superhero5
    ),
    SuperHero(
        name = R.string.hero6,
        description = R.string.description6,
        image = R.drawable.android_superhero6
    ),


)