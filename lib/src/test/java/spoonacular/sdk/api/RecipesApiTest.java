package spoonacular.sdk.api;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;

import spoonacular.sdk.model.Recipes;

public class RecipesApiTest {

    private RecipesApi api;
    
    @BeforeAll
    public void setup() {
        String apiKey = "faaf20a76c594ddabe3652a472c8bad1";
        api = new RecipesApi(apiKey);
    }

    @Test
    public void testListRecipes() throws IOException, InterruptedException {
        String query = "pizza";
        List<Recipes> recipes = api.listRecipes(query);
        assertNotNull(recipes);
        assertTrue(!recipes.isEmpty());
        System.out.println(recipes.toString());
    }
}
