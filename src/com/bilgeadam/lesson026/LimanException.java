package com.bilgeadam.lesson026;

public class LimanException extends Exception {

	private ErrorType errorType;

	public LimanException(ErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
	}

	public LimanException(ErrorType errorType, String message) {
		super(message);
		this.errorType = errorType;
	}

	public ErrorType getErrorType() {
		return errorType;
	}

}
