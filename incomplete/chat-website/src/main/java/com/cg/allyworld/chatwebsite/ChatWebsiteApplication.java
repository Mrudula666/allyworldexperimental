package com.cg.allyworld.chatwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ChatWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatWebsiteApplication.class, args);
	}
	
	@Bean 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	
}

