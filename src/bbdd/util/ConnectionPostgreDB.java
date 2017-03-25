package bbdd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPostgreDB implements IConnectionDB {

	Connection conn;
	@Override
	public Connection createConnection(String path,String user,String password) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		
        	
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(path,  user, password);
        
        System.out.println("La conexión se realizo sin problemas! =) ");
		
		return conn;
	}

	@Override
	public void closeConnection() throws SQLException{
		// TODO Auto-generated method stub
		conn.close();
	}

}
