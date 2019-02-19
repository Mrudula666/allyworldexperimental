package com.cg.allyworld.chatreceiver.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.allyworld.chatreceiver.entity.ChatWebsite;
import com.cg.allyworld.chatreceiver.entity.Sender;
import com.cg.allyworld.chatreceiver.service.ReceiverService;

@RestController
@RequestMapping("/chats")
public class ReceiverResource {

	@Autowired
	private ReceiverService service;
	
	@Autowired
	private Sender sender;
	
	@PostMapping
	public void reply(@RequestBody ChatWebsite reply) {
		int senderId = reply.getSenderId();
		int receiverId = reply.getReceiverId();
		String message = reply.getMessage();
		System.out.println("giving reply");
		sender.send(senderId, receiverId, message);
	}

	public void sendingMessageFronOneToOne(Integer senderId, Integer receiverId, String message) {
		System.out.println("OK");
		service.sendMessage(senderId, receiverId, message);
	}

	@GetMapping("/messages")
	public ResponseEntity<List<ChatWebsite>> getAllPosts()
	{
		List<ChatWebsite> chat = service.getAllChat();
		return new ResponseEntity<List<ChatWebsite>>(chat , HttpStatus.OK);
	}
	
}
