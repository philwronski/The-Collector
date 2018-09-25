package fr.philwronski.thecollector.domain

interface GenericCollection<in T> {
    fun addItem(item: T)
}