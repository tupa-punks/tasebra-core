package com.example.card_game_helper.Models;






import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.*;
import java.util.UUID;
import java.util.Set;

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String text;
    private String colour;


    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;


    public UUID getTag_id() {
        return id;
    }

    public void setTag_id(UUID tag_id) {
        this.id = tag_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }





}