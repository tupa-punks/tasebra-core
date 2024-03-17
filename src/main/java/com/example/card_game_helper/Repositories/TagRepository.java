package com.example.card_game_helper.Repositories;

import com.example.card_game_helper.Models.Tag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface TagRepository extends CrudRepository<Tag, UUID> {
    List<Tag> findAllByGroupId(UUID groupId);
    List<Tag> findAllByActivities_Id(UUID activityId);
}
