package com.example.coffeedyakonov;

public class Coffee {
    private String title;
    private String description;
    private String[] ingredients;
    private String image;
    private long id;

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String[] getIngredients() { return ingredients; }
    public void setIngredients(String[] value) { this.ingredients = value; }

    public String getImage() { return image; }
    public void setImage(String value) { this.image = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }
}
