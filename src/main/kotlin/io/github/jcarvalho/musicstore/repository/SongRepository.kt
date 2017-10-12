package io.github.jcarvalho.musicstore.repository

import io.github.jcarvalho.musicstore.model.Song
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

interface SongRepository : ReactiveMongoRepository<Song, String> {

    fun findByAlbumId(albumId: String): Flux<Song>

}
