package com.bilgeadam.lesson033.dependencyinversion.exception;

public class StoryException extends RuntimeException {

	String message;

	public StoryException(String message) {
		super(message);
		this.message = message;
	}

}