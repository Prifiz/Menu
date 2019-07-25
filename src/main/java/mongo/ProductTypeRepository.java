package mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductTypeRepository extends MongoRepository<ProductType, String> {
    List<ProductType> findAll();
    Optional<ProductType> findById(String id);
}
