package com.mavrick.model;

public class BalanceInfo {
	private String message;
	private String coreJournal;
	private String customHeader;
	private Content content;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCoreJournal() {
		return coreJournal;
	}
	@Override
	public String toString() {
		return "BalanceInfo [message=" + message + ", coreJournal=" + coreJournal + ", customHeader=" + customHeader
				+ ", content=" + content + "]";
	}
	public void setCoreJournal(String coreJournal) {
		this.coreJournal = coreJournal;
	}
	public String getCustomHeader() {
		return customHeader;
	}
	public void setCustomHeader(String customHeader) {
		this.customHeader = customHeader;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
}
