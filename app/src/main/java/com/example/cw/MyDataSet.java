package com.example.cw;

public class MyDataSet {

    private String contact;
    private String time;
    private String newMessage;
    private int image;

    public MyDataSet(String contact, String time, String newMessage, int image) {
        this.contact = contact;
        this.time = time;
        this.newMessage = newMessage;
        this.image = image;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
