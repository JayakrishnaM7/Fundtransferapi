package com.mavrick.model;

public class Errormessage {
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	@Override
	public String toString() {
		return "Error [type=" + type + ", code=" + code + ", message=" + message + "]";
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String code;
	private String message;
}
