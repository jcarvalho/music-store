package io.github.jcarvalho.musicstore.controller

import io.github.jcarvalho.musicstore.service.AlbumService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/albums")
class AlbumController(private val albumService: AlbumService) {


    @GetMapping fun findAll() = albumService.findAll()

    @GetMapping("/{id}") fun findAlbum(@PathVariable id: String) = albumService.findAlbumId(id)

}
