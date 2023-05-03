package com.mavrick.model;

public class TransferRq {

	private String sender_account_num;
	private String receiver_account_num;
	private String amount;
	private String category;
	private String type;
	public String getSender_account_num() {
		return sender_account_num;
	}
	public void setSender_account_num(String sender_account_num) {
		this.sender_account_num = sender_account_num;
	}
	@Override
	public String toString() {
		return "TransferRq [sender_account_num=" + sender_account_num + ", receiver_account_num=" + receiver_account_num
				+ ", amount=" + amount + ", category=" + category + ", type=" + type + "]";
	}
	public String getReceiver_account_num() {
		return receiver_account_num;
	}
	public void setReceiver_account_num(String receiver_account_num) {
		this.receiver_account_num = receiver_account_num;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
