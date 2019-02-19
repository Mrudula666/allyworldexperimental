package com.cg.allyworld.chatreceiver.entity;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.allyworld.chatreceiver.resource.ReceiverResource;

@RabbitListener(queues = "chatQ")
@Component
public class Receiver {

	@Autowired
	private ReceiverResource resource;
	
	@RabbitHandler
	public void sendMessage(Object chatArray[]) {
		System.out.println("receiving");
		resource.sendingMessageFronOneToOne((Integer)chatArray[0], (Integer)chatArray[1],(String)chatArray[2]);
	}
}
