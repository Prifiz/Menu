package entities;

import java.util.Collection;

public interface CookBook {

    Collection<Recipe> findRecipesByDishName(String dishName);
    void addRecipe(String dishName, Recipe recipe);

}
