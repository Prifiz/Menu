package entities;

import lombok.Getter;

@Getter
public class RecipeItem {
    private Ingredient ingredient;
    private Quantity ingredientsQuantity;

    public RecipeItem(Ingredient ingredient, Quantity ingredientsQuantity) {
        this.ingredient = ingredient;
        this.ingredientsQuantity = ingredientsQuantity;
    }
}
