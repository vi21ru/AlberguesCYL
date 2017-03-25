package processes;

import java.util.ArrayList;
import java.util.List;

import beans.Albergue;

public class DBAReaderProcess implements IReader{

	@Override
	public List read() throws Exception {
		// TODO Auto-generated method stub
		
		
		//Obtenemos la conexion a BBDD.
				//DriverManager blablablalba
				
				String sql = "SELECT * FROM ALBERGUES";
				List<Albergue> lista= new ArrayList<Albergue>();
				/*
				 * while (ResultSet) {
				 * 	lista.add
				 * }{
				 */
				return lista;
	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
