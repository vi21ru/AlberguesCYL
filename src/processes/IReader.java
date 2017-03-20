package processes;

import java.io.FileNotFoundException;
import java.util.List;

public interface IReader {

	List read() throws Exception;
	String getPath();
}
