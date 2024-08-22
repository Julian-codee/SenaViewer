package edu.misena.senaviewer.model;

import java.util.Date;

public class book {

    int id;
    String title;
    Date editionDate;
    String editorial;
    String authors;
    String isbn;
    boolean readed;
    Date timeReaded;

    public book() {

    }

    public book(String title, Date edititionDate, String editorial, String isbn) {
        this.title = title;
        this.editionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;

    }

    //Getter y setter

    //id

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //title

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //EditionDate

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    //Editorial

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    //Authors

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    //Isbn

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    //Readed

    public boolean getReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    // TimeReaded

    public Date getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(Date timeReaded) {
        this.timeReaded = timeReaded;
    }


}
