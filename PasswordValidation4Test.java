package com.bridgelabz.junit;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PasswordValidation4Test {
	@Test
	public void whenGivenPasswordShouldValidateAndPassPasswordTestRule4() {
		PasswordValidation validator = new PasswordValidation();
		Boolean result = validator.passwordValidation("Qwe@ty9op");		
		assertTrue(result);
	}
}