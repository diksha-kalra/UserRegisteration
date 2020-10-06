package com.capg.uservalidation;

public class UserRegisterationException extends Exception {

	enum ExceptionType{
		INVALID_FIRST_NAME,INVALID_LAST_NAME,INVALID_EMAIL,INVALID_NUMBER,INVALID_PASSWORD;
	};
	ExceptionType type;
	public UserRegisterationException(ExceptionType type, String message) {
		super(message);
		this.type=type;
	}


}
