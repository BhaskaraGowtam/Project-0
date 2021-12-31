package com.orkut.entity;

import java.time.LocalTime;

public class TimeLineEntity {
	
	private String sender;
	private String messageOfTime; 
	private String message;
	private String receiver;
	
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}
	 
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessageOfTime() {
		return messageOfTime;
	}
	public void setMessageOfTime(String messageOfTime) {
		this.messageOfTime = messageOfTime;
	}
	

}
















