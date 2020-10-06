package com.Capgemini.com.userJunit;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User {

	private static Logger LOG = LogManager.getLogger(User.class);
	static Scanner sc = new Scanner(System.in);

	public boolean validateName(String name) {
		boolean validate = Pattern.matches("[A-Z]{1}[a-z]{2,}", name);
		return validate;
	}

	public static void main(String[] args) {
		User newUser = new User();
		
		LOG.info("Enter the First Name:");
		String firstName = sc.next();
		while (!(newUser.validateName(firstName))) {
			LOG.info("Invalid Entry. Enter the First Name:");
			firstName = sc.next();
		}

	}

}