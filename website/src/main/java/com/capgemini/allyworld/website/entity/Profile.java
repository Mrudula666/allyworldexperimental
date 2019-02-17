package com.capgemini.allyworld.website.entity;

import java.util.List;

public class Profile {

	private int profileId;
	private String userName;
	private String fullName;
	private String gender;
	private String dateOfBirth;
	private Long phoneNumber;
	private String relationShipStatus;
	private String currentAddress;
	private String permanentAddress;
	private String email;
	private String password;
	private List<Integer> friendsList;
	private List<Integer> pendingFriendList;
	private static int profileIdGenerator;

	static {
		profileIdGenerator = 100;
	}
	{
		profileId = profileIdGenerator++;
	}

	public Profile() {
		super();

	}

//	public Profile(int profileId, String fullName) {
//		super();
//		this.profileId = profileId;
//		this.fullName = fullName;
//	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getProfileId() {
		return profileId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String localDateTime) {
		this.dateOfBirth = localDateTime;
	}

	public String getRelationShipStatus() {
		return relationShipStatus;
	}

	public void setRelationShipStatus(String relationShipStatus) {
		this.relationShipStatus = relationShipStatus;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public List<Integer> getFriendsList() {
		return friendsList;
	}

	public void setFriendsList(List<Integer> friendsList) {
		this.friendsList = friendsList;
	}

	public List<Integer> getPendingFriendList() {
		return pendingFriendList;
	}

	public void setPendingFriendList(List<Integer> pendingFriendList) {
		this.pendingFriendList = pendingFriendList;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", userName=" + userName + ", fullName=" + fullName + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber + ", relationShipStatus="
				+ relationShipStatus + ", currentAddress=" + currentAddress + ", permanentAddress=" + permanentAddress
				+ ", email=" + email + ", password=" + password + ", friendsList=" + friendsList
				+ ", pendingFriendList=" + pendingFriendList + "]";
	}
}