package com.Capgemini.com.userJunit;

public class InvalidUserInputException extends Exception {
	InvalidUserInputException(String s){
		super(s);
		System.out.println(s);
	}
}
