package com.example.card_game_helper.Models;

import jakarta.persistence.Table;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.UuidGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID user_id;


        private String email;
        private String name;
        @ManyToMany
        Set<Group> userGroups;

    public Set<Group> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(Set<Group> userGroups) {
        this.userGroups = userGroups;
    }

    public Set<Activity> getLikes() {
        return likes;
    }

    public void setLikes(Set<Activity> likes) {
        this.likes = likes;
    }

    @ManyToMany
        Set<Activity> likes;
        public UUID getUser_id() {
            return user_id;
        }

        public void setUser_id(UUID user_id) {
            this.user_id = user_id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }





}
