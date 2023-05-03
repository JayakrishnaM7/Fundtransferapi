package com.mavrick.model;

public class Productofferingresponse {

	private String accountNumber;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getProductName() {
		return productName;
	}
	@Override
	public String toString() {
		return "Productofferingresponse [accountNumber=" + accountNumber + ", accountName=" + accountName
				+ ", mobileNumber=" + mobileNumber + ", productName=" + productName + ", Offerimage=" + Offerimage
				+ ", GropuName=" + GropuName + "]";
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getOfferimage() {
		return Offerimage;
	}
	public void setOfferimage(String offerimage) {
		Offerimage = offerimage;
	}
	public String getGropuName() {
		return GropuName;
	}
	public void setGropuName(String gropuName) {
		GropuName = gropuName;
	}
	private String accountName;
	private String mobileNumber;
	private String productName;
	private String Offerimage;
	private String GropuName;
}
