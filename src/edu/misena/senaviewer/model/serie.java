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
}
