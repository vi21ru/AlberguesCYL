package bbdd.util;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnectionDB {

	public Connection createConnection(String path,String user,String password) throws ClassNotFoundException,SQLException;
	public void closeConnection() throws SQLException;
}
