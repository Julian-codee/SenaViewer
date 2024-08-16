package edu.misena.senaviewer.model;

import java.util.Date;

public class serie {
    int id;
    String title;
    String genre;
    String creator;
    int duration;
    Date year;
    boolean viewed;
    int timeViewed;
    int sessionQuantity;
    public serie() {

    }

    public serie(String title,String genre, int duration){
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    //Getter and setters

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

    //duration

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //year

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    // viewed


    public boolean isViewed() {
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

    //SesssionQuantity


    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }
}
