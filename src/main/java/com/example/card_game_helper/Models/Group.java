package com.example.card_game_helper.Models;



import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String groupName;

    @ManyToMany
    Set<User> usersInGroups;
    @OneToMany(mappedBy = "group")
    private Set<Tag> tagsInGroup;

    @OneToMany(mappedBy = "group")
    private Set<Activity> activities;

    public UUID getGroup_id() {
        return id;
    }

    public void setGroup_id(UUID group_id) {
        this.id = group_id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<User> getUsersInGroups() {
        return usersInGroups;
    }

    public void setUsersInGroups(Set<User> usersInGroups) {
        this.usersInGroups = usersInGroups;
    }

    public Set<Tag> getTagsInGroup() {
        return tagsInGroup;
    }

    public void setTagsInGroup(Set<Tag> tagsInGroup) {
        this.tagsInGroup = tagsInGroup;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }
}
