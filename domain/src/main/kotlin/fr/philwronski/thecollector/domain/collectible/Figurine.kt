package fr.philwronski.thecollector.domain.collectible

import fr.philwronski.thecollector.domain.collectible.Collectible

data class Figurine(
        override val title: String
) : Collectible

