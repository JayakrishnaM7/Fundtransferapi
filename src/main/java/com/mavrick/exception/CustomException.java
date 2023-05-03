package com.mavrick.exception;

public class CustomException extends RuntimeException {
	public CustomException() {
		super("Invalid request header provided.");
	}
}
