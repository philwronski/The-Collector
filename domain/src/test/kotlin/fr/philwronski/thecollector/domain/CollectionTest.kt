package fr.philwronski.thecollector.domain

import fr.philwronski.thecollector.domain.collectibles.books.Book
import fr.philwronski.thecollector.domain.collectibles.films.Film
import org.junit.Test


class CollectionTest {
    @Test
    fun book_series_accept_only_book() {
        val bookList: List<Book> = listOf(Book("livre 1", 2), Book("livre 2", 4));
        val bookSerie: Serie<Book> = Serie("une série de livre", bookList)
        var x: List<Book> = listOf<Book>(Book("livre 1", 2))
        x = x.plus(Book("livre 2", 4))
        assert(x.size.equals(2))
        bookSerie.addItem(Book("livre 3", 4))
        assert(bookSerie.items.size.equals(3))
    }

    @Test
    fun collection_accept_collectibles_items() {
        val myCollection: Collection = Collection("une collection",
                mutableListOf(Book("livre 1", 5), Film("films 1")))
        assert(myCollection.items.isNotEmpty())
        val book: Book = myCollection.items.get(0) as Book
        assert(book.nbPages.equals(5))
    }
}