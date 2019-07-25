package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Document
public class Ingredient {

    @DBRef
    private Product product;

    private Quantity quantity;

    public Ingredient(Product product, Quantity quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
