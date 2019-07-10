import entities.CookBook;
import entities.DefaultCookBook;
import entities.Ingredient;
import entities.Quantity;
import entities.Recipe;
import entities.Unit;

public class App {

    public static void main(String[] args) {

        System.out.println("-=== Menu App ===-");

        CookBook cookBook = new DefaultCookBook();
        // fill with recipes or load: start
        Recipe teaRecipe = new Recipe().withTimeToCook(5);
        // store ingredients somewhere (DB table?)
        teaRecipe.addIngredient(new Ingredient("water"), new Quantity(100.0f, Unit.ML));
        teaRecipe.addIngredient(new Ingredient("teabag"), new Quantity(1.0f, Unit.PCS));
        // store actions (kind of DSL: "boil", "bake", "mug", etc., recipe constructor)
        teaRecipe.addInstructionStep("Boil water");
        teaRecipe.addInstructionStep("Pour to mug");
        teaRecipe.addInstructionStep("Put teabag into mug");
        teaRecipe.addInstructionStep("Wait for 5 minutes");
        teaRecipe.addInstructionStep("Enjoy");

        cookBook.addRecipe("5 minutes tea", teaRecipe);



        // choose food you want
        // choose recipes for all dishes
        // assign to food intakes
        // calculate needed outputs for all dishes
        // calculate needed ingredients quantities
        // calculate needed cooking time

        // or...
        // for one specific dish
        /*

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
