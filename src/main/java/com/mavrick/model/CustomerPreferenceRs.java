package com.mavrick.model;

public class CustomerPreferenceRs {

	private String EnableDisable;
	private String Ptype;
	public String getEnableDisable() {
		return EnableDisable;
	}
	public void setEnableDisable(String enableDisable) {
		EnableDisable = enableDisable;
	}
	public String getPtype() {
		return Ptype;
	}
	public void setPtype(String ptype) {
		Ptype = ptype;
	}
	@Override
	public String toString() {
		return "CustomerPreferenceRs [EnableDisable=" + EnableDisable + ", Ptype=" + Ptype + "]";
	}
}
