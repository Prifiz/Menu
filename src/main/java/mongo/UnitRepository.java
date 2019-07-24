package mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface UnitRepository extends MongoRepository<Unit, UUID> {
    List<Unit> findAll();
}
