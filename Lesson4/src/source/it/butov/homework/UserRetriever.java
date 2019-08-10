package source.it.butov.homework;

import java.io.IOException;

public interface UserRetriever {

	User[] retrieve() throws Exception;
	
	UserConverter getConverter();
}
