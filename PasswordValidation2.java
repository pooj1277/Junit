package com.bridgelabz.junit;

import java.util.regex.Pattern;

public class PasswordValidation2 {
	public static final String PASSWORD_VALIDATION_RULE2 = "^?[A-Z]{1}[a-z]{7,15}$";

	public boolean passwordValidation(String password) {
		return Pattern.matches(PASSWORD_VALIDATION_RULE2, password);
	}
}


