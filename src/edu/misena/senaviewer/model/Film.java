package edu.misena.senaviewer.model;

import java.util.Date;

//Creacion de la clase padre Film

public class Film {
    int id;
    String title;
    String genre;
    String creator;
    int duration;
    Date year;
    Boolean viewed;

    public Film(){

    }

    //Constructor

    public Film(int id, String title, String genre, String creator, int duration, Date year, Boolean viewed){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year =  year;
        this.viewed = viewed;
    }

    //Getters , setters and methods


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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }
}
