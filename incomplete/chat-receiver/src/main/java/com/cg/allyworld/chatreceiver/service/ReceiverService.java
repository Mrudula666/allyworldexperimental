package com.cg.allyworld.chatreceiver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.allyworld.chatreceiver.entity.ChatWebsite;

@Service
public interface ReceiverService {

	void sendMessage(Integer senderId, Integer receiverId, String message);

	List<ChatWebsite> getAllChat();

}
