package edu.misena.senaviewer.model;

public class serie extends Film {

    private int timeViewed;
    private int sessionQuantity;

    public serie(String title , String genre, int duration) {
       super(title , genre , creator, duration);

    }

    //Getter and setters

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    @Override
    public String toString(){
        return super.toString() + ", TimeViewed: " + timeViewed + " Minutes, sessionQuantity: " + sessionQuantity + "}";
    }
}
