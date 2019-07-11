package db;

import entities.Recipe;

import java.util.Collection;

public interface RecipesProcessor {
    void addRecipe(String dishName, Recipe recipe);
//    void editRecipe();
    Collection<Recipe> findByDishname(String dishName);
}
