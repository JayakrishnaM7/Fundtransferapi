package com.mavrick.model;

public class LoginRq {
	private String deviceId;
public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
private String acid;
public String getAcid() {
	return acid;
}
public void setAcid(String acid) {
	this.acid = acid;
}
@Override
public String toString() {
	return "LoginRq [deviceId=" + deviceId + ", acid=" + acid + ", password=" + password + "]";
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
private String password;
}
