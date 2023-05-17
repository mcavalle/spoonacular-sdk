package spoonacular.sdk.model;

import java.util.List;

public class DishPairing {
    private String text;
    List<Pairings> pairings;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public List<Pairings> getPairings() {
        return pairings;
    }
    public void setPairings(List<Pairings> pairings) {
        this.pairings = pairings;
    }
    
    @Override
    public String toString() {
        return "DishPairing [text=" + text + ", pairings=" + pairings + "]";
    }
    
    
}
