package com.example.card_game_helper.Models;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

import javax.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID group_id;

    private String groupName;

    @ManyToMany
    Set<User> usersInGroups;

    public UUID getGroup_id() {
        return group_id;
    }

    public void setGroup_id(UUID group_id) {
        this.group_id = group_id;
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
}
