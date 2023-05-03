package com.mavrick.model;

public class ResponseModel {
	private Integer responsestatuscode;
	private String message;
	private Errormessage error;
	private DataMessage data;
	private Object  userData;
	public Object getUserData() {
		return userData;
	}
	public void setUserData(Object userData) {
		this.userData = userData;
	}
	@Override
	public String toString() {
		return "ResponseModel [responsestatuscode=" + responsestatuscode + ", message=" + message + ", error=" + error
				+ ", data=" + data + ", userData=" + userData + "]";
	}
	public void setUserData(PrefrenecResponse userData) {
		this.userData = userData;
	}
	public Integer getResponsestatuscode() {
		return responsestatuscode;
	}
	public void setResponsestatuscode(Integer responsestatuscode) {
		this.responsestatuscode = responsestatuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Errormessage getError() {
		return error;
	}
	public void setError(Errormessage error) {
		this.error = error;
	}
	public DataMessage getData() {
		return data;
	}
	public void setData(DataMessage data) {
		this.data = data;
	}
}
