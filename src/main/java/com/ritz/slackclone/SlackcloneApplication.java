package com.ritz.slackclone;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SlackcloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlackcloneApplication.class, args);
	}

}
