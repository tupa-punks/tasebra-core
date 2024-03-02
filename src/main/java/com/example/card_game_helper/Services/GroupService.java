package com.example.card_game_helper.Services;

import com.example.card_game_helper.Models.Group;
import com.example.card_game_helper.Repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<Group> getGroups(int firstElement,int lastElement){
        return groupRepository.findByElementBetween(firstElement,lastElement);

    }
}
