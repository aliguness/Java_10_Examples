package com.bilgeadam.lesson033.dependencyinversion.exception;

public class VideoException extends RuntimeException{

	String message;

	public VideoException(String message) {
		super(message);
		this.message = message;
	}
	
	
}
