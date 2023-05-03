package com.mavrick.model;

public class DataMessage {
	private PrefrenecResponse prefrenecResponse;

	public PrefrenecResponse getPrefrenecResponse() {
		return prefrenecResponse;
	}

	public void setPrefrenecResponse(PrefrenecResponse prefrenecResponse) {
		this.prefrenecResponse = prefrenecResponse;
	}

	@Override
	public String toString() {
		return "DataMessage [prefrenecResponse=" + prefrenecResponse + ", getPrefrenecResponse()="
				+ getPrefrenecResponse() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
