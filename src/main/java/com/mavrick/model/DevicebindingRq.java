package com.mavrick.model;

public class DevicebindingRq {
private String deviceId;

public String getDeviceId() {
	return deviceId;
}

public void setDeviceId(String deviceId) {
	this.deviceId = deviceId;
}

@Override
public String toString() {
	return "DevicebindingRq [deviceId=" + deviceId + "]";
}
}
