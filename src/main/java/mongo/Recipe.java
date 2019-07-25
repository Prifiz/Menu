package mongo;

import entities.Quantity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Getter
@Setter
@Document
public class Recipe {

    @Id
    private String name;

    private Integer averageTimeToCookMins;
    private String cookingInstructions;
    private Quantity outputQuantity;

    @DBRef
    private Collection<Ingredient> ingredients;

    public Recipe() {
    }
}
