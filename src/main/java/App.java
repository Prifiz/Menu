import db.Connector;
import db.ConnectorFactory;
import db.RecipesProcessor;
import entities.Ingredient;
import entities.Quantity;
import entities.Recipe;
import entities.Unit;

import java.util.List;

public class App {

    public static void main(String[] args) {

        System.out.println("-=== Menu App ===-");

        Connector dbConnector = ConnectorFactory.byName("SQLite");

        dbConnector.initDatabase();

        RecipesProcessor recipesProcessor = dbConnector.getRecipesProcessor();

        Recipe teaRecipe = new Recipe().withTimeToCook(5);
        teaRecipe.addIngredient(new Ingredient("water"), new Quantity(100.0f, Unit.ML));
        teaRecipe.addIngredient(new Ingredient("teabag"), new Quantity(1.0f, Unit.PCS));
        teaRecipe.addInstructionStep("Boil water");
        teaRecipe.addInstructionStep("Pour to mug");
        teaRecipe.addInstructionStep("Put teabag into mug");
        teaRecipe.addInstructionStep("Wait for 5 minutes");
        teaRecipe.addInstructionStep("Enjoy");

        recipesProcessor.addRecipe("5 minutes tea", teaRecipe);

        List<Recipe> teaRecipes = (List<Recipe>) recipesProcessor.findByDishname("tea");

        // TODO store actions (kind of DSL: "boil", "bake", "mug", etc., recipe constructor)

        Quantity neededDishQuantity = new Quantity(1000.0f, Unit.GRAMS);


        // Case #1
        //
        // choose food you want
        // choose recipes for all dishes
        // assign to food intakes
        // calculate needed outputs for all dishes
        // calculate needed ingredients quantities
        // calculate needed cooking time

        // or...
        // for one specific dish
        /*

            Case #2

        I want some dish.
        Find all recipes
        Choose needed one
        Choose how much food I want
        Calculate ingredients

        */

        // find foods by ingredients
        // find foods by calories
        // find foods by likes...
        //

    }
}
