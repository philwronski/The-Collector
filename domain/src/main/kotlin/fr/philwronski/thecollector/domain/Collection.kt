package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectible.Collectible

class Collection(val title: String, val items: MutableList<Collectible>) : GenericCollection<Collectible> {
    override fun addItem(item: Collectible) {
        this.items.add(item)
    }
}