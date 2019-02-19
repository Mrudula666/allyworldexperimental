package com.cg.allyworld.chatreceiver.entity;
public class ChatWebsite {
	private Integer chatId;
	private Integer senderId;
	private Integer receiverId;
	private String Message;

	public ChatWebsite() {
		super();
	}

	public ChatWebsite(Integer chatId, Integer senderId, Integer receiverId, String message) {
		super();
		this.chatId = chatId;
		this.senderId = senderId;
		this.receiverId = receiverId;
		Message = message;
	}

	public Integer getChatId() {
		return chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}

	public Integer getSenderId() {
		return senderId;
	}

	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}

	public Integer getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "ChatWebsite [chatId=" + chatId + ", senderId=" + senderId + ", receiverId=" + receiverId + ", Message="
				+ Message + "]";
	}
}
