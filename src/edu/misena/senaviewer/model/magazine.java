package edu.misena.senaviewer.model;

import java.util.Date;

public class magazine extends Publication {
    int id;
    String authors;


    public magazine(String title, Date editionDate, String editorial) {
       super(title , editionDate , editorial);
    }

    //Getters and Setters

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
}
