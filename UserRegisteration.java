package com.blz.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {
	
	public static void main(String[] args) {
	
	//Printing Welcome Message
	System.out.println("Welcome to User Registration Program");
	
	Scanner sc=new Scanner(System.in);
	
	//Valid first name
	System.out.println("Enter The First Name");
	String first_name=sc.next();
	String pattern1 ="^[A-Z]{1}[a-z]{2,}$";
	Pattern first_name_pattern = Pattern.compile(pattern1);
    	Matcher m = first_name_pattern.matcher(first_name);
    	if(m.matches()) {
    		System.out.println("First Name follows pattern: "+first_name);
    	}
    	else {
    		System.out.println("First Name does not follows the pattern");	
    	}
    
    	//Valid last name
    	System.out.println("Enter The Last Name");
	String last_name=sc.next();
	String pattern2 ="^[A-Z]{1}[a-z]{2,}$";
	Pattern last_name_pattern = Pattern.compile(pattern2);
   	Matcher m2 = last_name_pattern.matcher(last_name);
    	if(m2.matches()) {
    		System.out.println("Last Name follows pattern: "+last_name);
    	}
    	else {
    		System.out.println("Last Name does not follows the pattern");
    	}
    
    	//Valid email
    	System.out.println("Enter The Email Id");
	String email_id=sc.next();
	String pattern3="^[abc]+(\\.[xyz]+)*@*+[bl]+[\\.[co]]*(\\.[A-Za-z]{2,})$";
	Pattern email_pattern = Pattern.compile(pattern3);
   	Matcher m3 = email_pattern.matcher(email_id);
    	if(m3.matches()) {
    		System.out.println("Email follows pattern: "+email_id);
    	}
    	else {
    		System.out.println("Email does not follows the pattern");
    	}
    
      	//Valid phone number
      	System.out.println("Enter The Mobile Number");
      	sc.next();
      	String mobile_number=sc.nextLine();
      	String pattern4 ="^[1-9]{2}\\s[1-9]{1}[0-9]{9}$";
      	Pattern mobile_pattern = Pattern.compile(pattern4);
      	Matcher m4 = mobile_pattern.matcher(mobile_number);
      	if(m4.matches()) {
      		System.out.println("Mobile Number follows pattern: "+mobile_number);
      	}
      	else {
      		System.out.println("Mobile Number does not follows the pattern");
      	}
      	
      	//Valid password of minimum 8 characters and at least one Upper Case Character
      	System.out.println("Enter your password");
        String password=sc.nextLine();
        String pattern5="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[^\\s]{8,}$";
        Pattern password_pattern = Pattern.compile(pattern5);
        Matcher m5 = password_pattern.matcher(password);
        if(m5.matches()) {
        	System.out.println("password follows pattern: "+password);
        }
        else {
        	System.out.println("password does not follows the pattern");	
        }
      	sc.close();
}
}
