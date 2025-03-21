package utils;

/**
 * Utility class that provides methods to validate common user inputs such as
 * email and password. The validation is done using regular expressions (regex).
 * <p>
 * This class is static and contains only static methods, making it suitable for
 * reusable validation logic throughout the application.
 * </p>
 * 
 * Example usage:
 * 
 * <pre>
 * boolean isValidEmail = InputValidator.validateEmail("test@example.com");
 * boolean isValidPassword = InputValidator.validatePassword("Password123");
 * </pre>
 * 
 * @author Augusto.Winkler
 */
public class InputValidator {

	/**
	 * Validates if the provided email is in a correct format.
	 * <p>
	 * The method uses a regular expression to check that the email follows a
	 * standard pattern: It must contain a local part, the '@' symbol, and a domain
	 * part with a valid TLD.
	 * </p>
	 * 
	 * @param email The email address to be validated.
	 * @return {@code true} if the email matches the regular expression,
	 *         {@code false} otherwise.
	 * @see <a href="https://en.wikipedia.org/wiki/Email_address#Syntax">Email
	 *      Address Syntax</a>
	 */
	public static boolean validateEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		return email.matches(emailRegex);
	}

	/**
	 * Validates if the provided password meets the required format.
	 * <p>
	 * The password must contain at least 8 characters, at least one uppercase
	 * letter, and at least one digit.
	 * </p>
	 * 
	 * @param password The password to be validated.
	 * @return {@code true} if the password matches the regular expression,
	 *         {@code false} otherwise.
	 * @see <a href="https://owasp.org/www-project-top-ten/">OWASP Top 10</a>
	 */
	public static boolean validatePassword(String password) {
		String passwordRegex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
		return password.matches(passwordRegex);
	}
}
