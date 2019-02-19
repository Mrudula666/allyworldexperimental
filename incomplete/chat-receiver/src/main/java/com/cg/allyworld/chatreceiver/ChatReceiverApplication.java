package com.cg.allyworld.chatreceiver;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.allyworld.chatreceiver.entity.ChatWebsite;

@SpringBootApplication
public class ChatReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatReceiverApplication.class, args);
	}

	@Bean
	public ChatWebsite initializingChatWebsite() {
		return new ChatWebsite();
	}

	@Bean
	public Queue queue() {
		return new Queue("chatQ", false);
	}
}
