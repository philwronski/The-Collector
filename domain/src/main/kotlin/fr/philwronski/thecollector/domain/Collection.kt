package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectible.Collectible

class Collection(val title: String, var items: List<Collectible>) : GenericCollection<Collectible> {
    override fun addItem(item: Collectible) {
        this.items = this.items.plus(item)
    }
}