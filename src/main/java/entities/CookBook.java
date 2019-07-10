package entities;

public interface CookBook {

    Recipe findRecipeByDishName(String dishName);
    void addRecipe(String dishName, Recipe recipe);

}
