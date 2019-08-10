package source.it.butov.homework;

import java.util.regex.Pattern;

public class UserValidatorImpl implements UserValidator{

	private static final String nameRegex = "[A-Z][a-z]{1,30}";
	private static final String emailRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	private static final String passwordRegex = "^\\S*$";

	@Override
	public ErrorType validate(User user) {

		if (!Pattern.matches(nameRegex, user.getFirstName())) {
			return ErrorType.BAD_FIRST_NAME;
		} else if (!Pattern.matches(nameRegex, user.getLastName())) {
			return ErrorType.BAD_LAST_NAME;
		} else if (!Pattern.matches(emailRegex, user.getEmail())) {
			return ErrorType.BAD_EMAIL;
		} else if (!Pattern.matches(passwordRegex, user.getPassword())) {
			return ErrorType.BAD_PASSWORD;
		}

		return null;
	}

}
