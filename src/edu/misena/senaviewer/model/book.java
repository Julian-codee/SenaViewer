package edu.misena.senaviewer.model;
import java.util.Date;

public class book {

    int id;
    String title;
    Date edititionDate;
    String editorial;
    String authors;
    int isbn;
    boolean readed;
    Date timeReaded;
    public book(){

    }

    public book (String title , Date edititionDate, String editorial, int isbn)
    {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;

    }

}
