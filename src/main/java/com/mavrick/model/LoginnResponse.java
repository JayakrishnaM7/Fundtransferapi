package com.mavrick.model;

public class LoginnResponse {
	private Integer responsestatuscode;
	private String message;
	private Errormessage error;
	private Object accountName;
	public Object getAccountName() {
		return accountName;
	}
	public void setAccountName(Object accountName) {
		this.accountName = accountName;
	}
	public Integer getResponsestatuscode() {
		return responsestatuscode;
	}
	public void setResponsestatuscode(Integer responsestatuscode) {
		this.responsestatuscode = responsestatuscode;
	}
	@Override
	public String toString() {
		return "LoginnResponse [responsestatuscode=" + responsestatuscode + ", message=" + message + ", error=" + error
				+ ", accountName=" + accountName + "]";
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
}
