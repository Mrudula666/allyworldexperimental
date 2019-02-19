package com.allyworld.app.profileservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.allyworld.app.profileservice.entity.Profile;

@Service
public interface ProfileService {

	void addNewProfile(Profile profile);

	Optional<Profile> getProfileById(int friendProfileId);

	Profile updateProfile(Profile profile);

	ResponseEntity<List<Profile>> getProfiles();

	ResponseEntity<Profile> deleteProfile(Profile profile);

	void deleteAllProfiles();

	void updatePendingFreindList(Integer senderProfileId, Integer receiverProfileId);

	List<Integer> getFriendsList(int senderId);

	void acceptingFriendList(int senderId, int receiverId);

	Profile getProfileByEmail(String email);

	Profile getProfileByLogin(String email, String password);
	
	Profile getProfileByName(String name);

}