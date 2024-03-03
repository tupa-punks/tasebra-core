package com.example.card_game_helper.DTO;

import java.util.List;

public class ActivityDTO {
    private String name;
    private int likes;
    private String picture;

    public ActivityDTO(String name, int likes, String picture) {
        this.name = name;
        this.likes = likes;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
