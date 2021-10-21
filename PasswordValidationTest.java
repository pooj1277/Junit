package com.bridgelabz.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordValidationTest {
	@Test
	public void whenGivenPasswordShouldValidateAndPassPasswordTestRule1A() {
		PasswordValidation validator = new PasswordValidation();
		Boolean result = validator.passwordValidation("PoojAvhad");		
		assertTrue(result);
	}
	
	@Test
	public void whenGivenPasswordShouldValidateAndPassPasswordTestRule1B() {
		PasswordValidation validator = new PasswordValidation();
		Boolean result = validator.passwordValidation("Pooja");		
		assertFalse(result);
	}
	
	@Test
	public void whenGivenPasswordShouldValidateAndPassPasswordTestRule1C() {
		PasswordValidation validator = new PasswordValidation();
		Boolean result = validator.passwordValidation("Qwertyui");		
		assertTrue(result);
	}

}
