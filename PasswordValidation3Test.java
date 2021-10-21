package com.bridgelabz.junit;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PasswordValidation3Test {
	@Test
	public void whenGivenPasswordShouldValidateAndPassPasswordTestRule3() {
		PasswordValidation validator = new PasswordValidation();
		Boolean result = validator.passwordValidation("Qwerty9op");		
		assertTrue(result);
	}
}
