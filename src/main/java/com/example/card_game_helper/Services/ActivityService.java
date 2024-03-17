
package com.example.card_game_helper.Services;

import com.example.card_game_helper.DTO.ActivityDTO;
import com.example.card_game_helper.DTO.TagDTO;
import com.example.card_game_helper.Models.Activity;
import com.example.card_game_helper.Models.Tag;
import com.example.card_game_helper.Repositories.ActivityRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public List<ActivityDTO> getActivities(UUID groupId, int firstElement, int lastElement) {
        int limit = lastElement - firstElement;
        Pageable pageable = PageRequest.of(firstElement, limit);
        List<Activity> activities = activityRepository.findByGroupId(groupId, pageable);

        List<ActivityDTO> activityDTOs = new ArrayList<>();
        for (Activity activity : activities) {
            List<TagDTO> tagDTOs = new ArrayList<>();
            for (Tag tag : activity.getTags()) {
                tagDTOs.add(new TagDTO(tag.getText(), tag.getColour()));
            }
            int likes = activity.getLikes();
            activityDTOs.add(new ActivityDTO(activity.getName(), likes, activity.getPicture(), tagDTOs));
        }

        return activityDTOs;
    }
}