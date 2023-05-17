package spoonacular.sdk.model;

import java.util.List;

public class RecipesResponse {
    //mapping the list of recipes
    List<Recipes> recipes;

    public List<Recipes> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipes> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        return "RecipesResponse [recipes=" + recipes + "]";
    }
    
}
