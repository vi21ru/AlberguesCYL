import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bbdd.manager.DBManager;
import bbdd.util.ConnectionPostgreDB;

public class TestDBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn=DBManager.getConnection("jdbc:postgresql://localhost:5432/Albergues","postgres","postgres");
			String query="Select * from albergues_schema.\"Albergues\"";
			Statement st=conn.createStatement();
			ResultSet sr=st.executeQuery(query);
			while(sr.next()){
				System.out.println(sr.getString(2));
			}
			
			
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
