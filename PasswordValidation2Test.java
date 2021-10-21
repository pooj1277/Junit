package com.bridgelabz.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordValidation2Test {
	@Test
	public void whenGivenPasswordShouldValidateAndPassPasswordTestRule2() {
		PasswordValidation validator = new PasswordValidation();
		Boolean result = validator.passwordValidation("Poojavhad");		
		assertTrue(result);
	}
}
