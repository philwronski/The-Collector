package fr.philwronski.thecollector.application

import fr.philwronski.thecollector.domain.CollectionType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CollectionController {

    @GetMapping()
    fun getAllCollectionType() = CollectionType.values()
}