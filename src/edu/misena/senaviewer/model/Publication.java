package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.List;

public class Publication {
    private String title;
    private Date editionDate;
    private String editorial;
    private List<String> authors;

    public Publication(String title , Date editionDate , String editorial ){
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;

    }

    //Getters and Setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", editionDate=" + editionDate +
                ", editorial='" + editorial + '\'' +
                ", authors=" + authors +
                '}';
    }
}
