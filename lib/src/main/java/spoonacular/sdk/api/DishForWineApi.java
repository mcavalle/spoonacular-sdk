package spoonacular.sdk.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import spoonacular.sdk.model.DishPairing;
import spoonacular.sdk.model.Pairings;

public class DishForWineApi {
    private final String API_URL;
    private String apiKey;
    private HttpClient client;
    private ObjectMapper mapper;

    public DishForWineApi(String apiKey){
        this.apiKey = apiKey;
        this.API_URL = "https://api.spoonacular.com/food/wine/dishes?apiKey=" + this.apiKey;
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
    }

    public DishPairing listDishes(String wine) throws IOException, InterruptedException{
        URI uri = URI.create(API_URL + "&wine=" + wine);

        HttpRequest request = generateRequest(uri);
        
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            var dishPairings = mapper.readValue(response.body(), DishPairing.class);

        return dishPairings;
    }

    public List<Pairings> listPairings() throws IOException, InterruptedException{
        URI uri = URI.create(API_URL);

        HttpRequest request = generateRequest(uri);

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            List<Pairings> pairings = mapper.readValue(response.body(), new TypeReference<List<Pairings>>() {});

            return pairings;
    }

    private HttpRequest generateRequest(URI uri){
        return HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .header("Content-Type", "application/json")
        .build();
    }
}
