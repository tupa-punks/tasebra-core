
package com.example.card_game_helper.Services;

import com.example.card_game_helper.Models.Activity;
import com.example.card_game_helper.Repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> getActivities(UUID groupId, int firstElement, int lastElement) {

        return activityRepository.findInRangeByGroupId(groupId, firstElement, lastElement);
    }
}