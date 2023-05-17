package spoonacular.sdk.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import spoonacular.sdk.model.IngredientInfo;

public class IngredientInfoApi {
    private final String API_URL;
    private String apiKey;
    private HttpClient client;
    private ObjectMapper mapper;

    public IngredientInfoApi(String apiKey) {
        this.apiKey = apiKey;
        this.API_URL = "https://api.spoonacular.com/food/ingredients";
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
    }

    public IngredientInfo getIngredientInfo(int ingredientId) throws IOException, InterruptedException {
        URI uri = URI.create(API_URL + "/" + ingredientId + "/information?apiKey=" + apiKey);

        HttpRequest request = generateRequest(uri);

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        IngredientInfo ingredientInfo = mapper.readValue(response.body(), IngredientInfo.class);

        return ingredientInfo;
    }

    public List<IngredientInfo> getIngredients() throws IOException, InterruptedException {
        URI uri = URI.create(API_URL + "/autocomplete?apiKey=" + apiKey);

        HttpRequest request = generateRequest(uri);

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        List<IngredientInfo> ingredients = mapper.readValue(response.body(), new TypeReference<List<IngredientInfo>>() {});

        return ingredients;
    }

    private HttpRequest generateRequest(URI uri) {
        return HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .header("Content-Type", "application/json")
                .build();
    }
}
