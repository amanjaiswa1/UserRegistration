package assignments.day19.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	static final String firstNamePattern = "^[A-Z][a-z]{2,}";
	static final String lastNamePattern = "^[A-Z][a-z]{2,}";
	static final String emailPattern = "^[a-z0-9]+([.+_-]?[a-z0-9]+)?@{1}[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}";
	static final String phoneNumberPattern = "^[0-9]{1,2}\\s[0-9]{10}";
	static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&]{1})[A-Za-z0-9@$!%*?&]{8,}";

	// UseCase1 : Validate first name.
	public static void validateFirstName(String firstName) {
		Pattern pattern = Pattern.compile(firstNamePattern);
		Matcher matcher = pattern.matcher(firstName);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Match Found.");
		else
			System.out.println("Match Not Found.");
	}

	// UseCase2 : Validate last name.
	public static void validateLastName(String lastName) {
		Pattern pattern = Pattern.compile(lastNamePattern);
		Matcher matcher = pattern.matcher(lastName);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Match Found.");
		else
			System.out.println("Match Not Found.");
	}

	// UseCase3&9 : Validate email.
	public static void validateEmail(String email) {
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Match Found.");
		else
			System.out.println("Match Not Found.");
	}

	// UseCase4 : Validate phone number.
	public static void validatePhoneNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile(phoneNumberPattern);
		Matcher matcher = pattern.matcher(phoneNumber);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Match Found.");
		else
			System.out.println("Match Not Found.");
	}

	// UseCase5-8 : Validate password.
	public static void validatePassword(String password) {
		Pattern pattern = Pattern.compile(passwordPattern);
		Matcher matcher = pattern.matcher(password);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Match Found.");
		else
			System.out.println("Match Not Found.");
	}

	public static void main(String[] args) {
		// UseCase1 : Validate first name.
		String firstName = "Tekesh";
		validateFirstName(firstName);

		// UseCase2 : Validate last name.
		String lastName = "Singh";
		validateLastName(lastName);

		// UseCase3 : Validate email.
		String email = "tekesh.singh@gmail.co.in";
		validateEmail(email);

		// UseCase4 : Validate phone number.
		String phoneNumber = "91 1234567890";
		validatePhoneNumber(phoneNumber);

		// UseCase5-8 : Validate password- exactly one special character.
		String password;
		password = "Tekesh1Singh@";
		validatePassword(password);

		// UseCase9 : Validate email for all valid and invalid samples.
		email = "abc+100@gmail.com"; // given valid sample
		validateEmail(email);
		email = "abc@abc@gmail.com"; // given invalid sample
		validateEmail(email);
	}
}
