package spoonacular.sdk.api;

import java.net.http.HttpClient;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class RecipesApi {
    private final String API_URL;
    private String apiKey;
    private HttpClient client;
    private ObjectMapper mapper;

    public RecipesApi(String apiKey){
        this.apiKey = apiKey;
        this.API_URL = "https://api.spoonacular.com/recipes/complexSearch?apiKey=" + this.apiKey + "&query=burger";
    }
}
