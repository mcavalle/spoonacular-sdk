package spoonacular.sdk.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import spoonacular.sdk.model.RecipesByIngredients;

public class RecipesByIngredientsApi {
    private final String API_URL;
    private String apiKey;
    private HttpClient client;
    private ObjectMapper mapper;

    public RecipesByIngredientsApi (String apiKey){
        this.apiKey = apiKey;
        this.API_URL = "https://api.spoonacular.com/recipes/findByIngredients?apiKey=" + this.apiKey;
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
    }

    public List<RecipesByIngredients> listRecipesByIngredients(String ingredients) throws IOException, InterruptedException{
        URI uri = URI.create(API_URL + "&ingredients=" + ingredients);

        HttpRequest request = generateRequest(uri);

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            List<RecipesByIngredients> recipesByIngredients = mapper.readValue(response.body(), new TypeReference<List<RecipesByIngredients>>() {});

            return recipesByIngredients;
    }

    private HttpRequest generateRequest(URI uri){
        return HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .header("Content-Type", "application/json")
        .build();
    }
}
