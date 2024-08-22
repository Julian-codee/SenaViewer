package edu.misena.senaviewer.model;

import java.util.Date;

public class movie {
    int id;
    String title;
    String genre;
    String creator;
    int duration;
    Date year;
    boolean viewed;
    int timeViewed;

    public movie() {

    }

    public movie(String title, String genre, String creator, int duration, Date year) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;

    }

    //Getters and Setters

    //id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Title

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Genre

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //Creator


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    //Duration

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //Year


    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    //Viewed

    public boolean getViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    //TimeViewed


    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
}
