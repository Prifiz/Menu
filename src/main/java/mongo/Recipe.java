package mongo;

import entities.Quantity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.UUID;

@Getter
@Setter
public class Recipe {

    @Id
    private UUID id;

    private String name;
    private Integer averageTimeToCookMins;
    private String cookingInstructions;
    private Collection<Ingredient> ingredients;
    private Quantity outputQuantity;

    public Recipe() {
    }
}
