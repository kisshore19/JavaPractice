package com.kishore.java.core.threads.withoutthreadpools;

public class MessageBean {

	private String userId;
	private String message;

	public MessageBean() {
		// TODO Auto-generated constructor stub
	}

	public MessageBean(String userid, String message) {

		this.userId = userid;
		this.message = message;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
