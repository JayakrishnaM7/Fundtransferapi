package com.mavrick.model;

public class Login {
	public String getUserNme() {
		return userNme;
	}

	public void setUserNme(String userNme) {
		this.userNme = userNme;
	}

	private String userNme;
	private String uid;
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	private String passWord;


	public String getPassWord() {
		return passWord;
	}


	@Override
	public String toString() {
		return "Login [userNme=" + userNme + ", uid=" + uid + ", passWord=" + passWord + "]";
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
