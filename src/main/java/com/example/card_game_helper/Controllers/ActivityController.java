package com.example.card_game_helper.Controllers;

import com.example.card_game_helper.Models.Activity;
import com.example.card_game_helper.Models.Group;
import com.example.card_game_helper.Services.ActivityService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping("/getActivities")
    public ResponseEntity<Object> getActivities(
//            @RequestHeader("Authorization") String token,
            @RequestParam UUID groupId,
//            @RequestParam UUID categoryId,
            @RequestParam int firstElement,
            @RequestParam int lastElement) throws JsonProcessingException {

        List<Activity> activities = activityService.getActivities(groupId, firstElement, lastElement);
        ObjectMapper objectMapper = new ObjectMapper();
        String output = "";
        for (Activity activity : activities) {
            output = objectMapper.writeValueAsString(activity);
        }
        return ResponseEntity.ok(output);
    }
}
