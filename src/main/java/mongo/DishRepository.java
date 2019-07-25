package mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DishRepository extends MongoRepository<Dish, String> {
    Optional<Dish> findById(String id);
}
