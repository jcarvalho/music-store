package io.github.jcarvalho.musicstore.repository

import io.github.jcarvalho.musicstore.model.Album
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface AlbumRepository : ReactiveMongoRepository<Album, String>
