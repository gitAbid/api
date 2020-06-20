package core.api.repository
import core.api.model.Chapter
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ChapterRepository : MongoRepository<Chapter, String> {
}