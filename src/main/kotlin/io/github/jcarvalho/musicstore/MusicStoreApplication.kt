package io.github.jcarvalho.musicstore

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MusicStoreApplication

fun main(args: Array<String>) {
    SpringApplication.run(MusicStoreApplication::class.java, *args)
}
