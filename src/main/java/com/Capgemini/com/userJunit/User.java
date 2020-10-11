package com.Capgemini.com.userJunit;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
interface IUserValidation{
	boolean validate(String userInput);
}

public class User {

	private static Logger LOG = LogManager.getLogger(User.class);
	static Scanner sc = new Scanner(System.in);

	IUserValidation validateName = name -> name.matches("[A-Z]{1}[a-z]{2,}");
	IUserValidation validateEmail = email -> email.matches("^[A-Za-z0-9]+([.+-][A-Za-z0-9-]+)?@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$");
	IUserValidation validateMobile = mobile -> mobile.matches("^[0-9]{2}[ ][0-9]{10}$");
	IUserValidation validatePassword = password -> password.matches("(?=^.{8,}$)(?=.*[A-Z])(?=.*[0-9])^[a-zA-Z0-9]*[^(A-Za-z0-9 )]{1}[0-9a-zA-Z]*$");

	public static void main(String[] args) throws InvalidUserInputException {

		User newUser = new User();

		LOG.info("Enter the First Name:");
		String firstName = sc.next();
		try {
			if (!(newUser.validateName.validate(firstName))) {
				throw new InvalidUserInputException("Invalid First Name");
			}
		} catch (InvalidUserInputException e) {
		}

		LOG.info("Enter the Last Name:");
		String lastName = sc.next();
		try {
			if (!(newUser.validateName.validate(lastName))) {
				throw new InvalidUserInputException("Invalid Last Name");
			}
		} catch (InvalidUserInputException e) {
		}

		LOG.info("Enter the Email:");
		String email = sc.next();
		try {
			if (!(newUser.validateEmail.validate(email))) {
				throw new InvalidUserInputException("Invalid Email");
			}
		} catch (InvalidUserInputException e) {
		}

		LOG.info("Enter the Mobile Number:");
		sc.nextLine();
		try {
			String mobileNumber = sc.nextLine();
			if (!(newUser.validateMobile.validate(mobileNumber))) {
				throw new InvalidUserInputException("Invalid Mobile Number");
			}
		} catch (InvalidUserInputException e) {
		}


		 LOG.info("Enter the Password:");
		 String password = sc.next();
		 try {
		 if (!(newUser.validatePassword.validate(password))) {
			 throw new InvalidUserInputException("Invalid Password");

			}
		} catch (InvalidUserInputException e) {
		}

		LOG.info("All Exceptions Handled");

	}

}