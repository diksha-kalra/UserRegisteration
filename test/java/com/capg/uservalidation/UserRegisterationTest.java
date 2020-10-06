package com.capg.uservalidation;

import org.junit.Test;
import org.junit.Assert;

public class UserRegisterationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validateFirstName("Diksha");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenImproper_ShouldThrowException() throws UserRegisterationException {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validateFirstName("Di ");
		try {
			if (result == true) {
				System.out.println("Matches pattern");
			} else {
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INVALID_FIRST_NAME,
						"invalid first name");
			}
		} catch (UserRegisterationException e) {
			System.out.println("e-" + e);
		}
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validateLasttName("Kalra");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenImproper_ShouldThrowException() throws UserRegisterationException {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validateLasttName("ka ");
		try {
			if (result == true) {
				System.out.println("Matches pattern");
			} else {
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INVALID_LAST_NAME,
						"invalid last name");
			}
		} catch (UserRegisterationException e) {
			System.out.println("e-" + e);
		}
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validateEmail("Kalradiksha11@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenImproper_ShouldThrowException() throws UserRegisterationException {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validateEmail("diksha@.com");
		try {
			if (result == true) {
				System.out.println("Matches pattern");
			} else {
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INVALID_EMAIL,
						"invalid email");
			}
		} catch (UserRegisterationException e) {
			System.out.println("e-" + e);
		}
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validatePhoneNumber("91 9899151937");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenImproper_ShouldThrowException() throws UserRegisterationException {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validatePhoneNumber("9899151937");
		try {
			if (result == true) {
				System.out.println("Matches pattern");
			} else {
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INVALID_NUMBER,
						"invalid phone number");
			}
		} catch (UserRegisterationException e) {
			System.out.println("e-" + e);
		}
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validatePassword("Ikdn@1234");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenImproper_ShouldThrowException() throws UserRegisterationException {
		UserRegisteration validator = new UserRegisteration();
		boolean result = validator.validatePassword("Diksha123");
		try {
			if (result == true) {
				System.out.println("Matches pattern");
			} else {
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INVALID_PASSWORD,
						"invalid password");
			}
		} catch (UserRegisterationException e) {
			System.out.println("e-" + e);
		}
	}
}