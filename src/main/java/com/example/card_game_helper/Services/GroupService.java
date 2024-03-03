package com.example.card_game_helper.Services;

import com.example.card_game_helper.Models.Group;
import com.example.card_game_helper.Repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<String> getGroups(int firstElement, int lastElement) {
        List<String> groupNames = groupRepository.findGroupNames();

        List<String> result = new ArrayList<>();
        int size = groupNames.size();
        if (size == 0 || firstElement >= size) {
            return result;
        }

        int endIndex = Math.min(lastElement, size);
        for (int i = firstElement; i < endIndex; i++) {
            result.add(groupNames.get(i));
        }

        return result;
    }
}
