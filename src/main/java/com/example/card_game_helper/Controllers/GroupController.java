package com.example.card_game_helper.Controllers;

import com.example.card_game_helper.Models.Group;
import com.example.card_game_helper.Services.GroupService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {

    @Autowired
    private GroupService groupService;
    @GetMapping("/getgroups")
    public ResponseEntity<Object> getGroups(
//            @RequestHeader("Authorization") String token,
            @RequestParam int firstElement,
            @RequestParam int lastElement) throws JsonProcessingException {

        List<Group> groups = groupService.getGroups(firstElement, lastElement);
        ObjectMapper objectMapper = new ObjectMapper();
        String output = "";
        for (Group group : groups) {
            output = objectMapper.writeValueAsString(group);
        }
        return ResponseEntity.ok(output);
    }

}
