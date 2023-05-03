package com.mavrick.model;

public class Bal {
private String account_num;
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
@Override
public String toString() {
	return "Bal [account_num=" + account_num + ", name=" + name + ", current_balance=" + current_balance
			+ ", available_balance=" + available_balance + ", getAccount_num()=" + getAccount_num() + ", getName()="
			+ getName() + ", getCurrent_balance()=" + getCurrent_balance() + ", getAvailable_balance()="
			+ getAvailable_balance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
public void setCurrent_balance(String current_balance) {
	this.current_balance = current_balance;
}
public String getAvailable_balance() {
	return available_balance;
}
public void setAvailable_balance(String available_balance) {
	this.available_balance = available_balance;
}
private String name;
private String current_balance;
private String available_balance;
}
