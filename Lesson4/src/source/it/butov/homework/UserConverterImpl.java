package source.it.butov.homework;

public class UserConverterImpl implements UserConverter {

	@Override
	public User convertFromCsv(String csvString) {
		String[] uField = csvString.split(";");
		User user = new User();
		
		user.setId(Integer.parseInt(uField[0]));
		user.setFirstName(uField[1]);
		user.setLastName(uField[2]);
		user.setEmail(uField[3]);
		user.setPassword(uField[4]);
		user.setBirthdayYear(Integer.parseInt(uField[5]));
		return user;
	}

}
