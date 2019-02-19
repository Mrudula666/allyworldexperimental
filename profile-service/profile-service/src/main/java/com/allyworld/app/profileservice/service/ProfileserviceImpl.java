package com.allyworld.app.profileservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.allyworld.app.profileservice.entity.Profile;
import com.allyworld.app.profileservice.repository.ProfileRepo;

@Service
public class ProfileserviceImpl implements ProfileService {
	@Autowired
	private ProfileRepo repository;

	@Override
	public void addNewProfile(Profile profile) {
		System.out.println("profile");
		repository.save(profile);

	}

	@Override
	public Optional<Profile> getProfileById(int profileId) {
		return repository.findById(profileId);
	}

	@Override
	public ResponseEntity<List<Profile>> getProfiles() {
				return new ResponseEntity<List<Profile>>(repository.findAll(),HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Profile> deleteProfile(Profile profile) {
		repository.delete(profile);
		return new ResponseEntity<Profile>(HttpStatus.OK);

	}

	@Override
	public Profile updateProfile(Profile profile) {
		profile.setFullName(profile.getFullName());
		profile.setDateOfBirth(profile.getDateOfBirth());
		profile.setRelationShipStatus(profile.getRelationShipStatus());
		profile.setUserName(profile.getUserName());
		profile.setCurrentAddress(profile.getCurrentAddress());
		profile.setPermanentAddress(profile.getPermanentAddress());
		profile.setFriendsList(profile.getFriendsList());
		profile.setPendingFriendList(profile.getPendingFriendList());
		System.out.println(profile);
		return repository.save(profile);
	}

	@Override
	public void deleteAllProfiles() {
		repository.deleteAll();

	}

	@Override
	public void updatePendingFreindList(Integer senderProfileId, Integer receiverProfileId) {
		System.out.println(senderProfileId + " " + receiverProfileId);
		Profile receiversProfile = getProfileById(receiverProfileId).get();
		List<Integer> updateFriendList = receiversProfile.getPendingFriendList();
		if (updateFriendList == null) {
			updateFriendList = new ArrayList<Integer>();
		}
		updateFriendList.add(senderProfileId);
		System.out.println(updateFriendList);
		receiversProfile.setPendingFriendList(updateFriendList);
		System.out.println(receiversProfile.getPendingFriendList());
		repository.save(receiversProfile);

	}
	/*
	 * @Override public List<Profile> getFriendsList(int senderId) { Profile
	 * senderProfile = getProfileById(senderId).get(); List<Profile> friendsList =
	 * senderProfile.getFriendsList(); return friendsList; }
	 */
	/*
	 * @Override public void acceptingFriendList(int senderId, int receiverId) {
	 * Profile sendersProfile = getProfileById(senderId).get(); List<Integer>
	 * senderFriendsList = getFriendsList(senderId);
	 * System.out.println(senderFriendsList); if (senderFriendsList == null) {
	 * senderFriendsList = new ArrayList<Integer>(); }
	 * senderFriendsList.add(receiverId);
	 * sendersProfile.setFriendsList(senderFriendsList);
	 * System.out.println(senderFriendsList); repository.save(sendersProfile);
	 * Profile receiversProfile = getProfileById(receiverId).get(); List<Integer>
	 * receiverFriendsList = getFriendsList(receiverId);
	 * System.out.println(receiverFriendsList); if (receiverFriendsList == null) {
	 * receiverFriendsList = new ArrayList<Integer>(); }
	 * receiverFriendsList.add(senderId); System.out.println(receiverFriendsList);
	 * receiversProfile.setFriendsList(receiverFriendsList);
	 * repository.save(receiversProfile); List<Integer> receiverPendingFriendList =
	 * receiversProfile.getPendingFriendList();
	 * System.out.println(receiverPendingFriendList);
	 * System.out.println(sendersProfile.getProfileId()); if
	 * (receiverPendingFriendList.contains(sendersProfile.getProfileId())) {
	 * receiverPendingFriendList.remove(sendersProfile.getProfileId());
	 * System.out.println(receiverFriendsList); }
	 * receiversProfile.setPendingFriendList(receiverPendingFriendList);
	 * repository.save(receiversProfile); }
	 */

	@Override public Profile getProfileByEmail(String email) {
	  System.out.println("hii"); 
	  //return repository.findProfileBylogin(email);
	  return new Profile(); 
	  }

	@Override
	public Profile getProfileByLogin(String email, String password) {
		System.out.println("hii");
		return repository.findProfileBylogin(email, password);
	}

	@Override
	public void acceptingFriendList(int senderId, int receiverId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getFriendsList(int senderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile getProfileByName(String name) {
		  return repository.findProfileByFullName(name);
		
	}

}
