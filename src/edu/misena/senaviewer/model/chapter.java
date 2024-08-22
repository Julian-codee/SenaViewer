package edu.misena.senaviewer.model;
import org.w3c.dom.css.CSSStyleRule;

import java.util.Date;

public class chapter {

    int id;
    String title;
    int duration;
    static Date year;
    boolean viewed;
    int timeViewed;
    int sessionNumber;
    public chapter(){
    }

    public  chapter(String title,int duration, Date year){
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    //Getters and setters

    //id

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    //Title

    public static String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    //Duration

    public static int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    //Year

    public static Date getYear(){
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    //Viewed

    public boolean getViewed(){
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    //TimeViewd

    public int getTimeViewed(){
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed){
        this.timeViewed = timeViewed;
    }

    //SessionNumber

    public int getSessionNumber(){
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber){
        this.sessionNumber = sessionNumber;
    }

}
