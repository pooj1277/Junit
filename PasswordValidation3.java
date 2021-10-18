package com.bridgelabz.junit;
import java.util.regex.Pattern;

public class PasswordValidation3 {
	private final String PASSWORD_VALIDATION_RULE3 = "[a-z A-z 0-9]{8,}";
	public boolean passwordValidation3(String password) {
		return Pattern.matches(PASSWORD_VALIDATION_RULE3, password);
	}

}
