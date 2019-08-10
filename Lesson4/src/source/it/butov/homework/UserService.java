package source.it.butov.homework;

public interface UserService {

	User[] getAllUsers() throws Exception;

	ErrorType validate(User user);

	UserRetriever getUserRetriever();

	void setUserRetriever(UserRetriever userRetriever);

	UserValidator getUserValidator();

	void setUserValidator(UserValidator userValidator);
}
