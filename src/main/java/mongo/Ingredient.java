package mongo;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Ingredient {

    private UUID productId;
    private Quantity quantity;

    public Ingredient(UUID productId, Quantity quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
}
