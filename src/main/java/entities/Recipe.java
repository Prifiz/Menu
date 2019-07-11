package entities;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Recipe {

    private int averageTimeMins = 0;
    private List<RecipeItem> ingredients;
    // TODO devices, dishes (plates, teapots, etc.)
    private Quantity outputQuantity;
    private CookingInstruction instruction;

    // share ingredients among instructions, inherit ingredients

    public Recipe() {
        ingredients = new ArrayList<>();
        instruction = new CookingInstruction();
    }

    public Recipe withTimeToCook(int minsToCook) {
        this.averageTimeMins = minsToCook;
        return this;
    }

    public void addIngredient(Ingredient ingredient, Quantity quantity) {
        ingredients.add(new RecipeItem(ingredient, quantity));
    }

    public void addInstructionStep(String instructionStep) {
        this.instruction.addStep(instructionStep);
    }
}
