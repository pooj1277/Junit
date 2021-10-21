package com.bridgelabz.junit;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class MobileNumberValidationTest {
	@Test
	public void whenEnteredMobileShouldValidateAndPassNumberTest1() {
		MobileNumberValidation validator = new MobileNumberValidation();
		Boolean result = validator.mobileNumberValidation("91 7577066080");
		
		assertTrue(result);
	}
}