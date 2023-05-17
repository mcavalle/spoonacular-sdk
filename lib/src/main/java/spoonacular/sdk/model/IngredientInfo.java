package spoonacular.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IngredientInfo {
    private int id;
    private String name;
    private String consistency;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getConsistency() {
        return consistency;
    }
    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }
    @Override
    public String toString() {
        return "IngredientInfo [id=" + id + ", name=" + name + ", consistency=" + consistency + "]";
    }

    
    
}
