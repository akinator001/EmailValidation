package com.cp.emailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailValidation {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void emailValidator() {
		System.out.println("Enter your Email :");
		String email = sc.next();
		
		Pattern pattern = Pattern.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]*(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
		Matcher matcher = pattern.matcher(email);
		Boolean bool = matcher.find();
		if (bool)
			System.out.println("Email is Valid");
		else
			System.out.println("Email is Unvalid");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Email validation");
		EmailValidation email = new EmailValidation();
	    EmailValidation.emailValidator();
	}

}
