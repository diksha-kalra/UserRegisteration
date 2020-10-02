package com.capg.uservalidation;
import org.junit.Test;
import org.junit.Assert;

	public class UserRegisterationTest {
	    
		@Test 
	    	public void givenFirstName_WhenProper_ShouldReturnTrue() {
			UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validateFirstName("Diksha");
			Assert.assertEquals(true,result);	
	    	}
	    
	    	@Test
	    	public void givenFirstName_WhenShort_ShouldReturnFalse() {
	    		UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validateFirstName("Di ");
			Assert.assertEquals(false,result);	
	    	}
	    
	    	@Test
	    	public void givenLastName_WhenProper_ShouldReturnTrue() {
	    		UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validateLasttName("Kalra");
			Assert.assertEquals(true,result);	
	    	}
	    	@Test
	    	public void givenLastName_WhenShort_ShouldReturnFalse() {
	    		UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validateLasttName("ka ");
			Assert.assertEquals(false,result);	
	   	 }
	    	@Test
	    	public void givenEmail_WhenProper_ShouldReturnTrue() {
	    		UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validateEmail("Kalradiksha11@gmail.com");
			Assert.assertEquals(true,result);	
	    	}
	    	@Test
	    	public void givenEmail_WhenImproper_ShouldReturnFalse() {
	    		UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validateEmail("diksha@.com");
			Assert.assertEquals(false,result);	
	    	}
	    	@Test
	    	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
	    		UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validatePhoneNumber("91 9899151937");
			Assert.assertEquals(true,result);	
	    	}
	    	@Test
	    	public void givenPhoneNumber_WhenImproper_ShouldReturnFalse() {
	    		UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validatePhoneNumber("9899151937");
			Assert.assertEquals(false,result);	
	    	}
	    	@Test
	   	public void givenPassword_WhenProper_ShouldReturnTrue() {
	    		UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validatePassword("Ikdn@1234");
			Assert.assertEquals(true,result);	
	    	}
	    	@Test
	    	public void givenPassword_WhenImproper_ShouldReturnFalse() {
	    		UserRegisteration validator = new UserRegisteration();
			boolean result= validator.validatePassword("Diksha123");
			Assert.assertEquals(false,result);	
	    }
}
