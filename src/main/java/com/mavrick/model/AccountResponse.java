package com.mavrick.model;

public class AccountResponse {

	private Integer responsestatuscode;
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
	@Override
	public String toString() {
		return "AccountResponse [responsestatuscode=" + responsestatuscode + ", message=" + message + ", error=" + error
				+ ", accountName=" + accountName + ", accountBalance=" + accountBalance + "]";
	}
	public Errormessage getError() {
		return error;
	}
	public void setError(Errormessage error) {
		this.error = error;
	}
	public Object getAccountName() {
		return accountName;
	}
	public void setAccountName(Object accountName) {
		this.accountName = accountName;
	}
	public String getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	private String message;
	private Errormessage error;
	private Object accountName;
	private String accountBalance;

}
