package com.capg.uservalidation;
import java.util.regex.Pattern;

public class UserValidation {

	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z])*@*+[a-zA-Z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String PHONE_NUMBER_PATTERN = "^[1-9]{2}\\s[1-9]{1}[0-9]{9}$";
	private static final String PASSWORD_PATTERN = "^(?=.*[@#$%!|'<>.^*()%!])(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[^\\s]{8,}$";
	private static final String EMAIL_SAMPLES_PATTERN = "^[a-zA-Z]+((\\.[0-9]+)|(\\+[0-9]+)|(\\-[0-9]+)|([0-9]))*@*+[a-zA-Z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}

	public boolean validateLasttName(String fname) {
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}

	public boolean validateEmail(String femail) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		return pattern.matcher(femail).matches();
	}

	public boolean validatePhoneNumber(String fnumber) {
		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		return pattern.matcher(fnumber).matches();
	}

	public boolean validatePassword(String fpassword) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		return pattern.matcher(fpassword).matches();
	}

	public static boolean validateEmailSamples(String femail) {
		Pattern pattern = Pattern.compile(EMAIL_SAMPLES_PATTERN);
		return pattern.matcher(femail).matches();
	}
}
