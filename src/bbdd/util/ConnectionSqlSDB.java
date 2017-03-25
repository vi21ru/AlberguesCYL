package bbdd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSqlSDB implements IConnectionDB{

	Connection conn;
	@Override
	public Connection createConnection(String path, String user, String password)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn=DriverManager.getConnection(path, user, password);
		System.out.println("Conexion exitosa");
		return conn;
	}

	@Override
	public void closeConnection() throws SQLException {
		// TODO Auto-generated method stub
		conn.close();
	}

}
