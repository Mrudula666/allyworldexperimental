package com.capgemini.allyworld.website.entity;

public class Request {
	private Integer senderId;
	private Integer ReceiverId;
	private String action;

	public Request() {
		super();
	}

	public Request(Integer senderId, Integer receiverId, String action) {
		super();
		this.senderId = senderId;
		ReceiverId = receiverId;
		this.action = action;
	}

	public Integer getSenderId() {
		return senderId;
	}

	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}

	public Integer getReceiverId() {
		return ReceiverId;
	}

	public void setReceiverId(Integer receiverId) {
		ReceiverId = receiverId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Request [senderId=" + senderId + ", ReceiverId=" + ReceiverId + ", action=" + action + "]";
	}

}
