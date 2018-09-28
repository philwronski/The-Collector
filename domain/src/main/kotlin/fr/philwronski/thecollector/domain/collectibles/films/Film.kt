package fr.philwronski.thecollector.domain.collectibles.films

import fr.philwronski.thecollector.domain.collectibles.Collectible
import java.time.Duration

data class Film(
        override val title: String,
        val duration: Duration,
        val director: String,
        val actors: List<Actor>
) : Collectible