/*
 * Problem : As a User need to enter a valid password - Should contain atleast 8 characters 
 * Author: Pooja Avhad
 */
package com.bridgelabz.junit;

import java.util.regex.Pattern;

public class PasswordValidation {
	public static final String PASSWORD_VALIDATION_RULE1 = "^[A-Za-z]{8,15}$";

	public boolean passwordValidation(String password) {
		return Pattern.matches(PASSWORD_VALIDATION_RULE1, password);
	}
}



