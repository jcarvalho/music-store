package io.github.jcarvalho.musicstore.repository

import io.github.jcarvalho.musicstore.model.Song
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface SongRepository : ReactiveMongoRepository<Song, String>
