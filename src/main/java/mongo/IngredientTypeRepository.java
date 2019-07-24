package mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IngredientTypeRepository extends MongoRepository<IngredientType, UUID> {
    List<IngredientType> findAll();
    Optional<IngredientType> findById(UUID id);
}
