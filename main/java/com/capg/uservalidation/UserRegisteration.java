package com.capg.uservalidation;

import java.util.regex.Pattern;
import java.util.*;

@FunctionalInterface
interface MyFunctionalInterface {
	public boolean validateDetails(String details);
}

public class UserRegisteration {

	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z])*@*+[a-zA-Z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String PHONE_NUMBER_PATTERN = "^[1-9]{2}\\s[1-9]{1}[0-9]{9}$";
	private static final String PASSWORD_PATTERN = "^(?=.*[@#$%!|'<>.^*()%!])(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[^\\s]{8,}$";
	private static final String EMAIL_SAMPLES_PATTERN = "^[a-zA-Z]+((\\.[0-9]+)|(\\+[0-9]+)|(\\-[0-9]+)|([0-9]))*@*+[a-zA-Z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// validating first name using lambda function
		System.out.println("Enter First Name");
		String fName = sc.next();
		sc.nextLine();
		MyFunctionalInterface validateFname = validateFirstName();
		if (validateFname.validateDetails(fName))
			System.out.println("First name is valid");
		else
			System.out.println("First name is invalid");

		// validating last name using lambda function
		System.out.println("Enter Last Name");
		String lName = sc.next();
		sc.nextLine();
		MyFunctionalInterface validateLname = validateLastName();
		if (validateLname.validateDetails(lName))
			System.out.println("Last name is valid");
		else
			System.out.println("Last name is invalid");

		// validating email id using lambda function
		System.out.println("Enter email id");
		String email = sc.next();
		sc.nextLine();
		MyFunctionalInterface validateEmail = validateEmail();
		if (validateEmail.validateDetails(email))
			System.out.println("email id is valid");
		else
			System.out.println("email id is invalid");

		// validating password using lambda function
		System.out.println("Enter Password");
		String password = sc.next();
		sc.nextLine();
		MyFunctionalInterface validatePassword = validatePassword();
		if (validatePassword.validateDetails(password))
			System.out.println("Password is valid");
		else
			System.out.println("Password is invalid");

		// validating phone number using lambda function
		System.out.println("Enter phone number");
		String phoneNo = sc.nextLine();
		MyFunctionalInterface validateNumber = validateMobileNumber();
		if (validateNumber.validateDetails(phoneNo))
			System.out.println("Phone number is valid");
		else
			System.out.println("Phone number is invalid");
		sc.close();
	}

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

	// lambda function to validate first name
	public static MyFunctionalInterface validateFirstName() {
		MyFunctionalInterface obj = (String firstName) -> {
			if (firstName.matches(FIRST_NAME_PATTERN))
				return true;
			else
				return false;
		};
		return obj;
	}

	// lambda function to validate last name
	public static MyFunctionalInterface validateLastName() {
		MyFunctionalInterface obj = (String lastName) -> {
			if (lastName.matches(LAST_NAME_PATTERN))
				return true;
			else
				return false;
		};
		return obj;
	}

	// lambda function to validate email
	public static MyFunctionalInterface validateEmail() {
		MyFunctionalInterface obj = (String email) -> {
			if (email.matches(EMAIL_PATTERN))
				return true;
			else
				return false;
		};
		return obj;
	}

	// lambda function to validate mobile number
	public static MyFunctionalInterface validateMobileNumber() {
		MyFunctionalInterface obj = (String mobile) -> {
			if (mobile.matches(PHONE_NUMBER_PATTERN))
				return true;
			else
				return false;
		};
		return obj;
	}

	// lambda function to validate password
	public static MyFunctionalInterface validatePassword() {
		MyFunctionalInterface obj = (String passWord) -> {
			if (passWord.matches(PASSWORD_PATTERN))
				return true;
			else
				return false;
		};
		return obj;
	}
}