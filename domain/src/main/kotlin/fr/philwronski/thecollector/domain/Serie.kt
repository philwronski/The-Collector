package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectible.Collectible

data class Serie<E : Collectible>(
        val title: String,
        val collectibles: List<E>
)