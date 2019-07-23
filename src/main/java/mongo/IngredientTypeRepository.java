package mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface IngredientTypeRepository extends MongoRepository<IngredientType, String> {
    List<IngredientType> findAll();
    Optional<IngredientType> findById(String id);
}
