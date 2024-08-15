package edu.misena.senaviewer.model;
import java.util.Date;

public class chapter {

    int id;
    String title;
    int duration;
    Date year;
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

}
