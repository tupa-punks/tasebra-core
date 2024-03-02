package com.example.card_game_helper.Repositories;

import com.example.card_game_helper.Models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, UUID> {

    @Query(name = "YourEntity.findInRangeByGroupId")
    List<Activity> findInRangeByGroupId(UUID id, int firstElement, int lastElement);

}