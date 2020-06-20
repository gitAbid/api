package core.api.repository

import core.api.model.Manga
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MangaRepository : MongoRepository<Manga, String> {
    fun findByMangaNameLike(name: String, pageable: Pageable): Page<Manga>
    fun findByMangaUrl(url:String):Manga?
}