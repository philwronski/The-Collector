package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectible.Book
import fr.philwronski.thecollector.domain.collectible.Collectible
import fr.philwronski.thecollector.domain.collectible.Figurine
import kotlin.reflect.KClass

enum class CollectionType(val clazz: KClass<out Collectible>) {
    PLAYABLE_FIGURINE(Figurine::class), COLLECTIBLE_FIGURINE(Figurine::class), FUNKO_POP(Figurine::class), BOOK(Book::class)

}