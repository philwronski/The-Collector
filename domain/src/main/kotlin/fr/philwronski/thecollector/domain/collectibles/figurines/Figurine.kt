package fr.philwronski.thecollector.domain.collectibles.figurines

import fr.philwronski.thecollector.domain.collectibles.Collectible

data class Figurine(
        override val title: String
) : Collectible

