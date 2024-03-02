package com.example.card_game_helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.example")
@SpringBootApplication
public class CardGameHelperApplication {

	public static void main(String[] args) {

		SpringApplication.run(CardGameHelperApplication.class, args);
	}

}
