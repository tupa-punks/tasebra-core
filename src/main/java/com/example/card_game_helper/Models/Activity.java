package com.example.card_game_helper.Models;

import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "activities")
public class Activity {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID activity_id;

    private String name;
    private String picture;

    private int likes;

    @ManyToMany
    Set<User> usersLikes;

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Set<User> getUsersLikes() {
        return usersLikes;
    }

    public void setUsersLikes(Set<User> usersLikes) {
        this.usersLikes = usersLikes;
    }



    public UUID getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(UUID activity_id) {
        this.activity_id = activity_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
