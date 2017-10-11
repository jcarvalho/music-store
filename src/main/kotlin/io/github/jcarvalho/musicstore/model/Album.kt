package io.github.jcarvalho.musicstore.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Album(
        val name: String,
        val year: Int,
        val author: Author,
        @Id val id: String = UUID.randomUUID().toString()
)
