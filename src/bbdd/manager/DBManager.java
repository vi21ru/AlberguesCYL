package bbdd.manager;

import java.sql.Connection;
import java.sql.SQLException;

import bbdd.util.ConnectionMongoDB;
import bbdd.util.ConnectionMysqlDB;
import bbdd.util.ConnectionOracleDB;
import bbdd.util.ConnectionPostgreDB;
import bbdd.util.ConnectionSqlSDB;
import bbdd.util.IConnectionDB;

public class DBManager {
	private final static int POSTGRE = 0;
	private final static int MYSQL = 1;
	private final static int ORACLE = 2;
	private final static int SQLSERVER = 3;
	private final static int MONGODB = 4;

	public static Connection getConnection(String path,String user, String password) throws SQLException, ClassNotFoundException {
		IConnectionDB IConnector =null;
		int type=getType(path);
		switch (type) {
		case POSTGRE:
			IConnector= new ConnectionPostgreDB();
			break;
		case MYSQL:
			IConnector= new ConnectionMysqlDB();
			break;
		case ORACLE:
			IConnector= new ConnectionOracleDB();
			break;
		case SQLSERVER:
			IConnector= new ConnectionSqlSDB();
			break;
		case MONGODB:
			IConnector=new ConnectionMongoDB();
			break;
		}
		Connection conn = IConnector.createConnection(path, user, password);
		return conn;
	}
	
	private static int getType(String path){
		int type;
		if(path.contains("postgre")){
			type=POSTGRE;
		}else if(path.contains("mysql")){
			type=MYSQL;
		}else if(path.contains("oracle")){
			type=ORACLE;
		}else if(path.contains("sqlserver")){
			type=SQLSERVER;
		}else {
			type=MONGODB;
		}
		return type;
	}
}
