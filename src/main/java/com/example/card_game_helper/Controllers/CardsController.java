package com.example.card_game_helper.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardsController {
    @GetMapping("/24")
    public String Cards24(){
        return "24Cards";
    }
    @GetMapping("/36")
    public String Cards36(){
        return "36Cards";
    }
    @GetMapping("/52")
    public String cards52() {
        return "52Cards";
    }
}
