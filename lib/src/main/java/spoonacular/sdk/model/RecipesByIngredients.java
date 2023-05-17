package spoonacular.sdk.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class RecipesByIngredients {
    //mapping the response of recipes by ingredients
    @JsonIgnoreProperties
    private int id;
    private String title;
    private String image;
    List<MissedIngredients> missedIngredients;
    List<UsedIngredients> usedIngredients;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public List<MissedIngredients> getMissedIngredients() {
        return missedIngredients;
    }
    public void setMissedIngredients(List<MissedIngredients> missedIngredients) {
        this.missedIngredients = missedIngredients;
    }

    @Override
    public String toString() {
        return "RecipesByIngredients [id=" + id + ", title=" + title + ", image=" + image + ", missedIngredients="
                + missedIngredients + "]";
    }
 
}
