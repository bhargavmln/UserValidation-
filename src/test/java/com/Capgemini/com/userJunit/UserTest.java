package com.Capgemini.com.userJunit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserTest {
	
	private String email;

	static User user = null;

	public UserTest(String email) {
		super();
		this.email = email;
	}

	@BeforeClass
	public static void setUp() {
		user = new User();
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com"}, { "abc-100@yahoo.com" },
				{ "abc.100@yahoo.com" }, { "abc111@abc.com"}, { "ac.100@abc.com.au" },
				{ "abc@1.com" }, { "abc@gmail.com.com"}, { "abc+100@gmail.com" } });

	}

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validateName.validate("Bhargav");
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenFirstName_WhenImproper_ShouldReturnTrue() {
		boolean validation = user.validateName.validate("bhargav");
    	Assert.assertFalse(validation);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validateName.validate("Bhargav");
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenLastName_WheImproper_ShouldReturnTrue() {
		boolean validation = user.validateName.validate("bhargav");
    	Assert.assertFalse(validation);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validateEmail.validate(email);
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenEmail_WhenImproper_ShouldReturnTrue() {
		boolean validation = user.validateEmail.validate("mln@.mln.com");
    	Assert.assertFalse(validation);
	}
	
	@Test
	public void givenMobile_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validateMobile.validate("91 9177634929");
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenMobile_WhenImproper_ShouldReturnTrue() {
		boolean validation = user.validateMobile.validate("919177634929");
    	Assert.assertFalse(validation);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validatePassword.validate("mlnMLN123!");
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenPassword_WhenImroper_ShouldReturnTrue() {
		boolean validation = user.validatePassword.validate("@mlnMLN123!");
    	Assert.assertFalse(validation);
	}

}
