package com.example.card_game_helper.Repositories;

import com.example.card_game_helper.Models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, UUID> {
    List<Group> findByElementBetween(int firstElement,int lastElement);
}
