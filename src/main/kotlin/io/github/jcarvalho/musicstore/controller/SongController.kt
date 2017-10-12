package io.github.jcarvalho.musicstore.controller

import io.github.jcarvalho.musicstore.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/albums/{albumId}/songs")
class SongController(private val songService: SongService) {

    @GetMapping fun findByAlbum(@PathVariable albumId: String) = songService.findByAlbumId(albumId)

    @GetMapping("/{songId}") fun findSong(@PathVariable albumId: String, @PathVariable songId: String)
            = songService.findSong(albumId = albumId, songId = songId)

}
