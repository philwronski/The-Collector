package fr.philwronski.thecollector.application

import fr.philwronski.thecollector.application.collectible.CollectionRequest
import fr.philwronski.thecollector.domain.Collection
import fr.philwronski.thecollector.domain.CollectionType
import fr.philwronski.thecollector.domain.Serie
import fr.philwronski.thecollector.domain.collectibles.books.Book
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/collection")
class CollectionController {

    @GetMapping()
    fun getAllCollectionType() = CollectionType.values()

    @PostMapping
    fun createCollection(@RequestBody collectionRequest: CollectionRequest): String {
        if (collectionRequest.type == null) {
            val collection: Collection = Collection(collectionRequest.title, mutableListOf())
        } else {
            val collection = when(collectionRequest.type) {
                CollectionType.BOOK -> Serie<Book>(collectionRequest.title, mutableListOf())
                else -> null
            }
        }

        return "ok"
    }

}