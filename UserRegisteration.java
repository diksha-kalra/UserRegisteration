package com.blz.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {
	
	public static void main(String[] args) {
	
	//Printing Welcome Message
	System.out.println("Welcome to User Registration Program");
	
	Scanner sc=new Scanner(System.in);
	
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

    	sc.close();
}
}
