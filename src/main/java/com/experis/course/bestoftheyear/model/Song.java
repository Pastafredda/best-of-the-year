package com.experis.course.bestoftheyear.model;

public class Song {

    private int id;
    private String Title;

    public Song(int id, String title) {
        this.id = id;
        Title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
