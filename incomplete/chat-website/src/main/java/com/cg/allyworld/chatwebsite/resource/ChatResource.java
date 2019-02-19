package com.cg.allyworld.chatwebsite.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.allyworld.chatwebsite.entity.ChatWebsite;

@Controller
public class ChatResource {
	
	@Autowired
	private RestTemplate template;
	
	@RequestMapping("/")
	public String indexpage() {
		return "index";
	}
	
//	@RequestMapping("/sendMessage")
//	public String sendMessage() {
//		return "SendmessageForm";
//	}
	
//	@RequestMapping("/send")
//	public void sendingMessage(@ModelAttribute ChatWebsite chat){
//		System.out.println("sending");
//		System.out.println(chat);
//		template.postForEntity("http://localhost:/sender",chat,ChatWebsite.class);
//	}
	
	@RequestMapping("/Message")
	public String replyMessage() {
		return "ReplymessageForm";
	}
	
	@RequestMapping("/reply")
	public void replyingMessage(@ModelAttribute ChatWebsite chat) {
		System.out.println("replying");
		System.out.println(chat);
		template.postForEntity("http://localhost:8899/chats", chat, ChatWebsite.class);
	}
	
	@RequestMapping("/chat")
	public String getMessages() {
		return "sendForm";
	}
	
	@RequestMapping("/allChat")
	public ModelAndView getAllChat() {
		System.out.println("Inside getAllChat method");
		ResponseEntity<List> chat = template.getForEntity("http://localhost:8899/chats/messages", List.class);
		List allChat = chat.getBody(); 
		System.out.println(allChat);
		return new ModelAndView("ChatForm" , "chat" , allChat);
	}

}
