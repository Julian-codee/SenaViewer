package edu.misena.senaviewer.model;

import java.util.Date;

public class magazine {
    int id;
    String title;
    Date editionDate;
    String editorial;
    String authors;

    public magazine() {

    }

    public magazine(String title, Date editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
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

    //editionDate

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
}
