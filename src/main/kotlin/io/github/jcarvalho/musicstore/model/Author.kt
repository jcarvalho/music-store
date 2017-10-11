package io.github.jcarvalho.musicstore.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Author(
        val name: String
)
