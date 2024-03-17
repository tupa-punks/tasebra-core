package com.example.card_game_helper.DTO;

import com.example.card_game_helper.Models.Tag;

import java.util.List;

public class ActivityDTO {
    private String name;
    private List<TagDTO> tags;
    private int likes;
    private String picture;



    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }

    public ActivityDTO(String name, int likes, String picture,List<TagDTO> tags) {
        this.name = name;
        this.tags = tags;
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
