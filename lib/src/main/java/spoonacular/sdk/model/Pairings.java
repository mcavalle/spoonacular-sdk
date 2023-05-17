package spoonacular.sdk.model;

import java.util.List;

public class Pairings {
    List<Pairings> pairings;

    public List<Pairings> getPairings() {
        return pairings;
    }

    public void setPairings(List<Pairings> pairings) {
        this.pairings = pairings;
    }

    @Override
    public String toString() {
        return "Pairings [pairings=" + pairings + "]";
    }

    
}
