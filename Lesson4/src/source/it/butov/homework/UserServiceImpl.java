package source.it.butov.homework;

public class UserServiceImpl implements UserService {

	private UserRetriever userRetriever;
	private UserValidator userValidator;

	public UserServiceImpl(UserRetriever userRetriever, UserValidator userValidator) {
		this.userRetriever = userRetriever;
		this.userValidator = userValidator;
	}

	@Override
	public User[] getAllUsers() throws Exception {

		return userRetriever.retrieve();
	}

	@Override
	public ErrorType validate(User user) {

		return userValidator.validate(user);
	}

	@Override
	public UserRetriever getUserRetriever() {
		return userRetriever;
	}

	@Override
	public void setUserRetriever(UserRetriever userRetriever) {
		this.userRetriever = userRetriever;
	}

	@Override
	public UserValidator getUserValidator() {
		return userValidator;
	}

	@Override
	public void setUserValidator(UserValidator userValidator) {
		this.userValidator = userValidator;
	}

}