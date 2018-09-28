package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectibles.books.Book
import fr.philwronski.thecollector.domain.collectibles.Collectible
import fr.philwronski.thecollector.domain.collectibles.figurines.Figurine
import kotlin.reflect.KClass

enum class CollectionType(val clazz: KClass<out Collectible>) {
    PLAYABLE_FIGURINE(Figurine::class), COLLECTIBLE_FIGURINE(Figurine::class), FUNKO_POP(Figurine::class), BOOK(Book::class)

}