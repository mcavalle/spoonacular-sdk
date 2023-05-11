package spoonacular.sdk.api;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import spoonacular.sdk.model.Recipes;

public class RecipesApiTest {
    @Test
    void listRecipes() throws IOException, InterruptedException{
        var apiKey = System.getenv("API_KEY");
        var query = System.getenv("query");
        var api = new RecipesApi(apiKey);
        List<Recipes> results = api.listRecipes();

        System.out.println(results);

        Assertions.assertFalse(results.isEmpty());
    }
}
