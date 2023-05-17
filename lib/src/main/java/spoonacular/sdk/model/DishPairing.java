package spoonacular.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DishPairing {
    private String status;
    private String text;
    private List<String> pairings;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getPairings() {
        return pairings;
    }

    public void setPairings(List<String> pairings) {
        this.pairings = pairings;
    }

    @Override
    public String toString() {
        return "DishPairing [status=" + status + ", text=" + text + ", pairings=" + pairings + "]";
    }
}
