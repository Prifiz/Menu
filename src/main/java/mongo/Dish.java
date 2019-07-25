package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

@Getter
@Setter
@Document
public class Dish {

    @Id
    private String dishName;

    @DBRef
    private Collection<Recipe> recipes;

    public Dish(String dishName) {
        this.dishName = dishName;
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
}
