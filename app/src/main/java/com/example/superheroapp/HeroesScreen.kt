package com.example.superheroapp

import android.content.ClipData.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroapp.model.SuperHero
import com.example.superheroapp.model.superHeroes


@Composable
fun HeroesList(
    heroesList: List <SuperHero>,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier) {
         items(heroesList){ hero ->
             HeroesItem(
                 hero = hero,
                 modifier = Modifier.padding(8.dp)
             )

         }
    }
}

@Composable
fun HeroesItem(
    hero: SuperHero,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .height(104.dp)
            .padding(16.dp)
    ) {
        Row() {
            Column() {
                Text(
                    text = LocalContext.current.getString(hero.name),
                    //modifier = modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    text = LocalContext.current.getString(hero.description),
                    //modifier = modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                    style = MaterialTheme.typography.bodyLarge

                )
            }
            Spacer(Modifier.width(16.dp))
            Image(
                painter = painterResource(hero.image),
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
        }
    }

}

@Preview
@Composable
private fun heroesItemPreview() {
}