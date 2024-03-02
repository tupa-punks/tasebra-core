package com.example.card_game_helper.Models;




import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.*;
import java.util.Set;
import java.util.UUID;

@NamedQueries({
        @NamedQuery(
                name = "Activity.findInRangeByGroupId",
                query = "SELECT e FROM Activity e WHERE e.group.Id = :groupId AND e.someIntColumn BETWEEN :firstElement AND :lastElement"
        )
})
@Entity
@Table(name = "activities")
public class Activity {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    private String name;
    private String picture;

    private int likes;

    @ManyToMany
    Set<User> usersLikes;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;



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
        return id;
    }

    public void setActivity_id(UUID activity_id) {
        this.id = activity_id;
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
