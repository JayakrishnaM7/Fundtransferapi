package com.mavrick.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PrefrenecResponse {
	private String accountname;
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getAcid() {
		return acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}
	@JsonIgnore
	public String getPassword() {
		return password;
	}
	@JsonSetter
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "PrefrenecResponse [accountname=" + accountname + ", acid=" + acid + ", password=" + password
				+ ", mobilenumber=" + mobilenumber + ", bindidmobilenumber=" + bindidmobilenumber + ", accountno="
				+ accountno + ", cif=" + cif + "]";
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getBindidmobilenumber() {
		return bindidmobilenumber;
	}
	public void setBindidmobilenumber(String bindidmobilenumber) {
		this.bindidmobilenumber = bindidmobilenumber;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	private String acid;
	
	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	
	private String mobilenumber;
	private String bindidmobilenumber;
	private String accountno;
	private String cif;
	
	
	
	
}
