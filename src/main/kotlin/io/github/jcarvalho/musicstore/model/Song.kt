package io.github.jcarvalho.musicstore.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Song(
        val albumId: String,
        val name: String,
        val trackNr: Int,
        @Id val id: String = UUID.randomUUID().toString()
)
