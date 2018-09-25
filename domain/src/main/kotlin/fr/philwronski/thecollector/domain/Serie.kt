package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectible.Collectible

class Serie<E : Collectible>(val title: String, val items: MutableList<E>) : GenericCollection<E> {
    override fun addItem(item: E) {
        this.items.add(item)
    }
}