package com.Capgemini.com.userJunit;

import org.junit.Test;
import org.junit.Assert;
import org.junit.BeforeClass;

public class UserTest {

	static User user = null;

	@BeforeClass
	public static void setUp() {
		user = new User();
	}

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validateName("Bhargav");
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenFirstName_WhenImproper_ShouldReturnTrue() {
		boolean validation = user.validateName("bhargav");
    	Assert.assertFalse(validation);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validateName("Bhargav");
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenLastName_WheImproper_ShouldReturnTrue() {
		boolean validation = user.validateName("bhargav");
    	Assert.assertFalse(validation);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validateEmail("mln@mln.com");
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenEmail_WhenImproper_ShouldReturnTrue() {
		boolean validation = user.validateEmail("mln@.mln.com");
    	Assert.assertFalse(validation);
	}
	
	@Test
	public void givenMobile_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validateMobile("91 9177634929");
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenMobile_WhenImproper_ShouldReturnTrue() {
		boolean validation = user.validateMobile("919177634929");
    	Assert.assertFalse(validation);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean validation = user.validatePassword("mlnMLN123!");
    	Assert.assertTrue(validation);
	}
	
	@Test
	public void givenPassword_WhenImroper_ShouldReturnTrue() {
		boolean validation = user.validatePassword("@mlnMLN123!");
    	Assert.assertFalse(validation);
	}
}
