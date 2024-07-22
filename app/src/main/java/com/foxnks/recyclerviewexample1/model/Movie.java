package com.foxnks.recyclerviewexample1.model;

public class Movie {

    private String title;
    private int image;
    private String description;
    private String worldPremiere;
    private int year;

    public Movie() {
    }

    public Movie(String title, int image, String description, String worldPremiere , int year) {
        this.title = title;
        this.image = image;
        this.description = description;
        this.worldPremiere = worldPremiere;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
