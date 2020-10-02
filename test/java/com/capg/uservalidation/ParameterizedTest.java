package com.capg.uservalidation;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import  org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	
	private String Input;
	private boolean Output;
	private UserRegisteration eMail;
	
	@Before
	public void initialize() {
		eMail=new UserRegisteration();
	}
	
	
	public ParameterizedTest(String Input, boolean Output) {
		this.Input=Input;
		this.Output=Output;
		}
	
	@Parameterized.Parameters
	public static Collection eMail() {
		return Arrays.asList(new Object [][] {	{"abc@yahoo.com", true},
		   									  	{"abc@gmail.com.com",true},
		   									  	{"abc-100@yahoo.com",true},
		   									  	{"abc.100@yahoo.com",true},
		   									  	{"abc111@abc.com",true},
		   									  	{"abc-100@abc.net",true},
											  	{"abc.100@abc.com.au",true},
											  	{"abc@1.com",true},
											  	{"abc+100@gmail.com",true},
											  	{"abc@.com.my",false},
												{"abc123@gmail.a",false},
												{"abc123@.com",false},
												{"abc123@.com.com ",false},
												{".abc@abc.com",false},
												{"abc()*@gmail.com",false},
												{"abc@%*.com",false},
												{"abc..2002@gmail.com",false},
												{"abc.@gmail.com",false},
												{"abc@abc@gmail.com",false},
												{"abc@gmail.com.1a",false},		
												{"abc@gmail.com.aa.a",false}});
	}
		
	@Test
	public void testParameterizedTest() {
		System.out.println("Input: "+Input);
		assertEquals(Output,UserRegisteration.validateEmailSamples(Input));
	}
}


