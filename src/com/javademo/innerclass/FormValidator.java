package com.javademo.innerclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormValidator {

	static int length = 10;

	public static boolean validatePhoneNumber(String phoneNumber) {
		// PhoneNumber class local to validatePhoneNumber utility
		class PhoneNumber {
			String phoneNumber;

			public PhoneNumber(String phoneNumber) {
				if (phoneNumber.length() == length) // have access to member 'length' of an enclosing class
					this.phoneNumber = phoneNumber;
				else
					this.phoneNumber = null;
			}

			public String getPhoneNumber() {
				return phoneNumber;
			}
		}

		PhoneNumber number = new PhoneNumber(phoneNumber);
		return number.getPhoneNumber() != null;
	}

	public static boolean validateEmail(String email) {
		final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);

		class EmailRecipient {
			String email;
			private boolean valid;

			public EmailRecipient(String e) {
				email = e;
				// locally declared RegEx is declared final so it can be accessed here
				Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
				valid = matcher.find();

			}

			public boolean isValid() {
				return valid;
			}
		}

		EmailRecipient recipient = new EmailRecipient(email);
		return recipient.isValid();
	}
}