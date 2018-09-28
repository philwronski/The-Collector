package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectibles.Collectible

class Serie<E : Collectible>(val title: String, var items: List<E>) : GenericCollection<E> {
    override fun addItem(item: E) {
        this.items = this.items.plus(item)
    }
}