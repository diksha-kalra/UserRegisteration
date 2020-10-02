package com.capg.uservalidation;

public class UserValidationException extends Exception {

	enum ExceptionType{
		INVALID_FIRST_NAME,INVALID_LAST_NAME,INVALID_EMAIL,INVALID_NUMBER,INVALID_PASSWORD;
	};
	ExceptionType type;
	public UserValidationException(ExceptionType type, String message) {
		super(message);
		this.type=type;
	}


}

