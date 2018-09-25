package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectible.Book
import fr.philwronski.thecollector.domain.collectible.Film
import org.junit.Test


class CollectionTest {
    @Test
    fun book_series_accept_only_book() {
        val bookList: MutableList<Book> = mutableListOf(Book("livre 1"), Book("livre 2"));
        val bookSerie: Serie<Book> = Serie("une série de livre", bookList)
    }

    @Test
    fun collection_accept_collectibles_items() {
        val myCollection: Collection = Collection("une collection",
                mutableListOf(Book("livre 1"), Film("film 1")))
        assert(myCollection.items.isNotEmpty())
    }
}