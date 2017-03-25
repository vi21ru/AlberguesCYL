package bbdd.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysqlDB implements IConnectionDB{

	Connection conn;
	@Override
	public Connection createConnection(String path, String user, String password)
			throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(path, user, password);
		System.out.println("Conexion a MYSQL creada");
		// TODO Auto-generated method stub
		return conn;
	}

	@Override
	public void closeConnection() throws SQLException {
		// TODO Auto-generated method stub
		conn.close();
	}

}
