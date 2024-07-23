package com.foxnks.recyclerviewexample1.model;

import java.util.List;

public class Movie {

    private String title;
    private int image;
    private List<Integer> pictures;
    private String description;
    private String worldPremiere;
    private int year;
    private boolean visibility;
    private String cast;

    public Movie() {
    }

    public Movie(String title, int image, String description, String worldPremiere , int year,String cast) {
        this.title = title;
        this.image = image;
        this.description = description;
        this.worldPremiere = worldPremiere;
        this.year = year;
        this.cast = cast;
        this.visibility = false;
    }

    public Movie(String title, List<Integer> pictures) {
        this.title = title;
        this.pictures = pictures;
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

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public List<Integer> getPictures() {
        return pictures;
    }

    public void setPictures(List<Integer> pictures) {
        this.pictures = pictures;
    }
}
