package spoonacular.sdk.model;

import java.util.List;

public class Pairings {
    List<String> pairings;

    public List<String> getPairings() {
        return pairings;
    }

    public void setPairings(List<String> pairings) {
        this.pairings = pairings;
    }

    @Override
    public String toString() {
        return "Pairings [pairings=" + pairings + "]";
    }


    
}
