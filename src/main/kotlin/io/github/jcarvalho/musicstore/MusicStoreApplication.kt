package io.github.jcarvalho.musicstore

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import io.github.jcarvalho.musicstore.model.Album
import io.github.jcarvalho.musicstore.model.Author
import io.github.jcarvalho.musicstore.model.Song
import io.github.jcarvalho.musicstore.repository.AlbumRepository
import io.github.jcarvalho.musicstore.repository.SongRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

@SpringBootApplication
class MusicStoreApplication {

    @Bean fun jacksonBuilder() = Jackson2ObjectMapperBuilder().apply {
        propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
    }

    @Bean
    fun dbSeed(albumRepository: AlbumRepository,
               songRepository: SongRepository) = CommandLineRunner {
        albumRepository.deleteAll().and(songRepository.deleteAll()).subscribe(null, null) {
            val thriller = Album(
                    name = "Thriller",
                    year = 1982,
                    author = Author(name = "Michael Jackson")
            )
            val hotelCalifornia = Album(
                    name = "Hotel California",
                    year = 1976,
                    author = Author(name = "The Eagles")
            )
            val songList = setOf(
                    Song(thriller.id, "Wanna Be Startin' Somethin'", 1),
                    Song(thriller.id, "Baby Be Mine", 2),
                    Song(thriller.id, "The Girl Is Mine", 3),
                    Song(thriller.id, "Thriller", 4),
                    Song(hotelCalifornia.id, "Hotel California", 1),
                    Song(hotelCalifornia.id, "New Kid in Town", 2),
                    Song(hotelCalifornia.id, "Life in the Fast Lane", 3),
                    Song(hotelCalifornia.id, "Wasted Time", 4)
            )

            albumRepository.saveAll(setOf(thriller, hotelCalifornia)).subscribe(::println, null) {
                songRepository.saveAll(songList).subscribe(::println)
            }
        }
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(MusicStoreApplication::class.java, *args)
}
