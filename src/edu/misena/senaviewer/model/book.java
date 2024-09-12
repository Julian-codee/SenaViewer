package edu.misena.senaviewer.model;

import java.util.Date;

public class book extends Publication {

    int id;
    String authors;
    String isbn;
    boolean readed;
    Date timeReaded;

    public book(String title, Date editionDate, String editorial) {
        super(title , editionDate , editorial);
    }

    //Getter y setter

    //id

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
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
