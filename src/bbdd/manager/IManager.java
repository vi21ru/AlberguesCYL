package bbdd.manager;

import java.sql.SQLException;
import java.util.Collection;

public interface IManager {

	public Collection select() throws SQLException;
	//public Collection select(int i);
	public void insert(Object obj)throws SQLException;
	public void update(Object obj)throws SQLException;
	public void delete(Object obj)throws SQLException;
	
}
