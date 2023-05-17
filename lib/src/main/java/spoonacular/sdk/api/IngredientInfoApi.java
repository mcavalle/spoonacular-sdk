package spoonacular.sdk.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import spoonacular.sdk.model.IngredientInfo;

public class IngredientInfoApi {
    private final String API_URL;
    private String apiKey;
    private int id;
    private HttpClient client;
    private ObjectMapper mapper;

    public IngredientInfoApi(String apiKey, int id){
        this.apiKey = apiKey;
        this.id = id;
        this.API_URL = "https://api.spoonacular.com/food/ingredients/" + this.id + "/information?apiKey=" + this.apiKey;
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
    }

    public IngredientInfo listIngredientInfo() throws IOException, InterruptedException{
        URI uri = URI.create(API_URL);

        HttpRequest request = generateRequest(uri);
        
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            var ingredientInfo = mapper.readValue(response.body(), IngredientInfo.class);

        return ingredientInfo;
    }

    private HttpRequest generateRequest(URI uri){
        return HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .header("Content-Type", "application/json")
        .build();
    }
}
