package com.mavrick.model;

public class Content {
private String account_num;
private String name;
private String current_balance;
private String available_balance;
private String product_type;
public String getAccount_num() {
	return account_num;
}
public void setAccount_num(String account_num) {
	this.account_num = account_num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCurrent_balance() {
	return current_balance;
}
public void setCurrent_balance(String current_balance) {
	this.current_balance = current_balance;
}
public String getAvailable_balance() {
	return available_balance;
}
@Override
public String toString() {
	return "Content [account_num=" + account_num + ", name=" + name + ", current_balance=" + current_balance
			+ ", available_balance=" + available_balance + ", product_type=" + product_type + "]";
}
public void setAvailable_balance(String available_balance) {
	this.available_balance = available_balance;
}
public String getProduct_type() {
	return product_type;
}
public void setProduct_type(String product_type) {
	this.product_type = product_type;
}
	
}
