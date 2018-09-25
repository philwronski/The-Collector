package fr.philwronski.thecollector.application.collectible

import fr.philwronski.thecollector.domain.CollectionType

data class CollectionRequest(
        val type: CollectionType?,
        val title: String)
