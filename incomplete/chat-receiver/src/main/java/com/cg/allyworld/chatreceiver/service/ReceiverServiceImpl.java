package com.cg.allyworld.chatreceiver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.allyworld.chatreceiver.entity.ChatWebsite;
import com.cg.allyworld.chatreceiver.repository.ReceiverRepository;

@Service
public class ReceiverServiceImpl implements ReceiverService {

	@Autowired
	private ReceiverRepository repository;
	
	@Autowired
	private ChatWebsite chat;

	@Override
	public void sendMessage(Integer senderId, Integer receiverId, String message) {
		System.out.println("Going to database");
		chat.setSenderId(senderId);;
		chat.setReceiverId(receiverId);
		chat.setMessage(message);
		repository.save(chat);
	}

	@Override
	public List<ChatWebsite> getAllChat() {
		return repository.findAll();
	}

}
