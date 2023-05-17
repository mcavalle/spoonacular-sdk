package spoonacular.sdk.api;

import org.junit.jupiter.api.Assertions;

public class SearchIngredientsApiTest {
    @Test
    void criaUmObjetoSearchIngredientApi(){
        var apiKey = "API_KEY";
        var api = new SearchIngredientsApi(apiKey);
        Assertions.assertNotNull(api);
    }
}
