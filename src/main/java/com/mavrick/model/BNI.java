package com.mavrick.model;

public class BNI {
	private String message;private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private Bal bal;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Bal getBal() {
		return bal;
	}
	public void setBal(Bal bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "BNI [message=" + message + ", content=" + content + ", bal=" + bal + ", getContent()=" + getContent()
				+ ", getMessage()=" + getMessage() + ", getBal()=" + getBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
