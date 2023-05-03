package com.mavrick.model;

public class ProductofferingresponseData {
private Productofferingresponse productofferingresponse;

public Productofferingresponse getProductofferingresponse() {
	return productofferingresponse;
}

public void setProductofferingresponse(Productofferingresponse productofferingresponse) {
	this.productofferingresponse = productofferingresponse;
}

@Override
public String toString() {
	return "ProductofferingresponseData [productofferingresponse=" + productofferingresponse
			+ ", getProductofferingresponse()=" + getProductofferingresponse() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}
