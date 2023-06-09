package spoonacular.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public class MissedIngredients {
    //mapping the list of missed ingredients in the recipe

    private int id;
    private double amount;
    private String unit;
    private String name;
    private String original;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOriginal() {
        return original;
    }
    public void setOriginal(String original) {
        this.original = original;
    }

    @Override
    public String toString() {
        return "MissedIngredients [id=" + id + ", amount=" + amount + ", unit=" + unit + ", name=" + name
                + ", original=" + original + "]";
    }
}
