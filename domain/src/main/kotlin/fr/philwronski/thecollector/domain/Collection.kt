package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectible.Collectible

data class Collection(
        val title: String,
        val collectibles: List<Collectible>
)