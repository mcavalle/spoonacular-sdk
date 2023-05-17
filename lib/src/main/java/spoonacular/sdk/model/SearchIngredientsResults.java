package spoonacular.sdk.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchIngredientsResults {
    private int number;
    private int totalResults;
    List<SearchResults> searchResults;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    public List<SearchResults> getSearchResults() {
        return searchResults;
    }
    public void setSearchResults(List<SearchResults> searchResults) {
        this.searchResults = searchResults;
    }

    @Override
    public String toString() {
        return "SearchIngredientsResults [number=" + number + ", totalResults=" + totalResults + ", searchResults="
                + searchResults + "]";
    }

        
}
