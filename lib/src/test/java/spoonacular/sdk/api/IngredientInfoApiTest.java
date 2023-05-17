package spoonacular.sdk.api;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;

import spoonacular.sdk.model.IngredientInfo;

public class IngredientInfoApiTest {
    @Test
    void searchIngredientInfo() throws IOException, InterruptedException {
        var apiKey = System.getenv("API_KEY");
        var api = new IngredientInfoApi(apiKey);
        IngredientInfo response = api.getIngredientInfo(9003);

        System.out.println(response);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(9003, response.getId());
    }
}
