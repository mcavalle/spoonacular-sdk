package spoonacular.sdk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecipesByIngredientsApiTest {
    @Test
    void criaUmObjetoRecipesByIngredients(){
        var apiKey = "API_KEY";
        var api = new RecipesByIngredientsApi(apiKey);
        Assertions.assertNotNull(api);
    }
}
