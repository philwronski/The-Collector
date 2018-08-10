package fr.philwronski.thecollector.application

import fr.philwronski.thecollector.domain.Serie
import fr.philwronski.thecollector.domain.collectible.Book
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CollectionController {

    @GetMapping()
    fun getAllCollectionType() = Serie<Book>("", listOf())//CollectionType.values()
}