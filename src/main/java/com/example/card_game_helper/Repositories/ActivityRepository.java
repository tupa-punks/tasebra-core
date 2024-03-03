package com.example.card_game_helper.Repositories;

import com.example.card_game_helper.Models.Activity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, UUID> {

    List<Activity> findByGroupId(UUID id, Pageable pageable) ;
//    List<Activity> findByGroupId(UUID id);
}