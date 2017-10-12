package io.github.jcarvalho.musicstore.service

import io.github.jcarvalho.musicstore.repository.AlbumRepository
import org.springframework.stereotype.Service

@Service
class AlbumService(private val albumRepository: AlbumRepository) {

    fun findAll() = albumRepository.findAll()

    fun findAlbumId(id: String) = albumRepository.findById(id)

}
