package io.github.jcarvalho.musicstore.service

import io.github.jcarvalho.musicstore.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(private val songRepository: SongRepository) {

    fun findByAlbumId(albumId: String) = songRepository.findByAlbumId(albumId)

    fun findSong(albumId: String, songId: String) = songRepository.findById(songId).filter { it.albumId == albumId }

}
