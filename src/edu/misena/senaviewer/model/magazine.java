package edu.misena.senaviewer.model;
import java.util.Date;

public class magazine {
    int id;
    String title;
    Date editionDate;
    String editorial;
    String authors;
    public magazine(){

    }

    public magazine(String title, Date editionDate,String editorial){
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }
}
