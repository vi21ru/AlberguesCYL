import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bbdd.util.ConnectionPostgreDB;
import bbdd.util.IConnectionDB;

public class TestConnectionPostgreBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConnectionPostgreDB pgConn=new ConnectionPostgreDB();
		try {
			Connection conn=pgConn.createConnection("jdbc:postgresql://localhost:5432/Albergues", "postgres", "postgres");
			String query="Select * from albergues_schema.\"Albergues\"";
			Statement st=conn.createStatement();
			ResultSet sr=st.executeQuery(query);
			while(sr.next()){
				System.out.println(sr.getString(2));
			}
			
			
			pgConn.closeConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
