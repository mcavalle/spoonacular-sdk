package spoonacular.sdk.api;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import spoonacular.sdk.model.DishPairing;


public class DishForWineApiTest {
    @Test
    void listDishes() throws IOException, InterruptedException{
        var apiKey = System.getenv("API_KEY");
        var api = new DishForWineApi(apiKey);
        DishPairing response = api.listDishes("merlot");

        System.out.println(response);

    }
}
