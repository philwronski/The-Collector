package fr.philwronski.thecollector.domain.collectibles.books

import fr.philwronski.thecollector.domain.collectibles.Collectible
import java.time.LocalDate

data class Book(
        override val title: String,
        val nbPages: Int,
        val category: CategoryBook,
        val author: String,
        val editor: String,
        val collection: String,
        val releaseDate: LocalDate,
        val format: FormatBook,
        val paperback: Boolean
) : Collectible