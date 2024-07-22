package com.foxnks.recyclerviewexample1.model;

public class Movie {

    private String title;
    private int image;
    private String description;
    private String worldPremiere;

    public Movie() {
    }

    public Movie(String title, int image, String description, String worldPremiere) {
        this.title = title;
        this.image = image;
        this.description = description;
        this.worldPremiere = worldPremiere;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorldPremiere() {
        return worldPremiere;
    }

    public void setWorldPremiere(String worldPremiere) {
        this.worldPremiere = worldPremiere;
    }
}
