package bbdd.manager;

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

	public static IConnectionDB getConnection(String path){
		IConnectionDB IConnector =null;
		int type=getType(path);
		switch (type) {
		case 0:
			IConnector= new ConnectionPostgreDB();
			break;
		case 1:
			IConnector= new ConnectionMysqlDB();
			break;
		case 2:
			IConnector= new ConnectionOracleDB();
			break;
		case 3:
			IConnector= new ConnectionSqlSDB();
			break;
		default:
			IConnector=new ConnectionMongoDB();
			break;
		}
		return IConnector;
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
