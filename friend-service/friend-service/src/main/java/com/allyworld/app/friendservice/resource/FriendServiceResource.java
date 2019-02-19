package com.allyworld.app.friendservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyworld.app.friendservice.entity.Request;
import com.allyworld.app.friendservice.entity.Sender;

@RestController
@RequestMapping("/friends")
public class FriendServiceResource {

	@Autowired
	private Sender sender;

	@PostMapping
	public ResponseEntity<String> sendFriendRequest( @RequestBody Request request) {
		int senderId = request.getSenderId();
		int receiverId = request.getReceiverId();
		String actionType = request.getAction();
		System.out.println("receiving");
		System.out.println(senderId +""+ receiverId+""+actionType);
		sender.send(senderId, receiverId,actionType);
		System.out.println("sent");
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PostMapping("/{senderId}")
	public ResponseEntity<String> getFriendsList(@PathVariable int senderId) {
		sender.getAllFriendsByProfileId(senderId);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<String> acceptingRequest(@RequestBody Request request){
		int senderId = request.getSenderId();
		int receiverId = request.getReceiverId();
		String actionType = request.getAction();
		System.out.println("receiving");
		System.out.println(senderId +""+ receiverId);
		sender.acceptingFriendRequest(senderId, receiverId,actionType);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
