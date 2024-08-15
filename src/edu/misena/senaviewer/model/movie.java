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
    public movie(){

    }

    public movie(String title, String genre, String creator,int duration, Date year ){
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;

    }
}
