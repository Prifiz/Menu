package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
public class Product {

    @Id
    private UUID id;

    private UUID ingredientTypeId;
    private String name;

    public Product() {}

    public Product(UUID id, UUID ingredientTypeId, String name) {
        this.id = id;
        this.ingredientTypeId = ingredientTypeId;
        this.name = name;
    }
}
