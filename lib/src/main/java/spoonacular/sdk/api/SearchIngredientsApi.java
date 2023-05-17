package spoonacular.sdk.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import spoonacular.sdk.model.SearchIngredientsResults;
import spoonacular.sdk.model.SearchResults;

public class SearchIngredientsApi {
    private final String API_URL;
    private String apiKey;
    private HttpClient client;
    private ObjectMapper mapper;

    public SearchIngredientsApi (String apiKey){
        this.apiKey = apiKey;
        this.API_URL = "https://api.spoonacular.com/food/ingredients/search?apiKey=" + this.apiKey;
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
    }

    //gets the information from the class "SearchIngredientsResponse"
    public SearchIngredientsResults listResults(String ingredientQuery) throws IOException, InterruptedException{
        URI uri = URI.create(API_URL + "&query=" + ingredientQuery);

        HttpRequest request = generateRequest(uri);
        
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            var searchIngredientsResponse = mapper.readValue(response.body(), SearchIngredientsResults.class);

        return searchIngredientsResponse;
    }

    public List<SearchResults> listSearchResults() throws IOException, InterruptedException{
        URI uri = URI.create(API_URL);

        HttpRequest request = generateRequest(uri);

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            List<SearchResults> recipesByIngredients = mapper.readValue(response.body(), new TypeReference<List<SearchResults>>() {});

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
