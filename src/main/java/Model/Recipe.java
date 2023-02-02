/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author forumkaria
 */
public class Recipe {

    private String recipeTitle;
    private Integer noOfServings; 
    private Boolean isGlutenFree ;
    private float diffLevel;
    private int noOfIngredients;
    private String imagePath;

    public
    String getImagePath() {
        return imagePath;
    }

    public
    void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    private String category;
    private String description;
    
    
    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public Integer getNoOfServings() {
        return noOfServings;
    }

    public void setNoOfServings(Integer noOfServings) {
        this.noOfServings = noOfServings;
    }

    public Boolean getIsGlutenFree() {
        return isGlutenFree;
    }

    public void setIsGlutenFree(Boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    public float getDiffLevel() {
        return diffLevel;
    }

    public void setDiffLevel(float diffLevel) {
        this.diffLevel = diffLevel;
    }

    public int getNoOfIngredients() {
        return noOfIngredients;
    }

    public void setNoOfIngredients(int noOfIngredients) {
        this.noOfIngredients = noOfIngredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
