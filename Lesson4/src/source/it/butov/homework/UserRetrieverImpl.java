package source.it.butov.homework;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserRetrieverImpl implements UserRetriever {

	private UserConverter userConverter;

	
	public UserRetrieverImpl(UserConverter userConverter) throws Exception {
		this.userConverter = userConverter;
	}
	
	@Override
	public User[] retrieve() throws Exception {

		long lineCount = Files.lines(Paths.get("hometask.txt")).filter(line -> !line.startsWith("#")).count();
		User[] converted = new User[(int) lineCount];

		Scanner sc = new Scanner("hometask.txt");
		int i = 0;

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			converted[i] = userConverter.convertFromCsv(line);
			i++;
		}
		sc.close();

		return converted;

	}

	@Override
	public UserConverter getConverter() {
		return userConverter = new UserConverterImpl();
	}

}
