package com.mavrick.model;

public class LoginResponse {
private String message;
private String responsestatuscode;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getResponsestatuscode() {
	return responsestatuscode;
}
public void setResponsestatuscode(String responsestatuscode) {
	this.responsestatuscode = responsestatuscode;
}
@Override
public String toString() {
	return "LoginResponse [message=" + message + ", responsestatuscode=" + responsestatuscode + "]";
}
}
