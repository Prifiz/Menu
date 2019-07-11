package entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DefaultCookBook implements CookBook {

    private Map<String, List<Recipe>> recipes;

    public DefaultCookBook() {
        this.recipes = new HashMap<>();
    }


    public Collection<Recipe> findRecipesByDishName(String dishName) {
        return null;
    }

    @Override
    public void addRecipe(String dishName, Recipe recipe) {
        List<Recipe> currentDishRecipes = recipes.getOrDefault(dishName, new ArrayList<>());
        currentDishRecipes.add(recipe);
        recipes.put(dishName, currentDishRecipes);
    }
}
