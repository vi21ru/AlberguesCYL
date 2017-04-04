package processes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bbdd.manager.DBManager;
import beans.Albergue;

public class DBAReaderProcess implements IReader{

	String path;
	String user;
	String password;
	public DBAReaderProcess(String path,String user,String password){
		this.path=path;
		this.user=user;
		this.password=password;
	}
	public DBAReaderProcess(String datosConexion){
		this.path=datosConexion;
	}
	@Override
	public List read() throws Exception {
		// TODO Auto-generated method stub
		
		
		//Obtenemos la conexion a BBDD.
				Connection conn=DBManager.getConnection(path, user, password);
				
				//Aqui el problema que veo es claro que se que es un postgre pero se supone que con el dbmanager me 
				//puede devolver otra conexion con otra base de datos y la consulta seria distinta...
				String sql = "Select * from albergues_schema.\"Albergues\"";
				Statement st=conn.createStatement();
				
				List<Albergue> lista= new ArrayList<Albergue>();
				
				ResultSet rs=st.executeQuery(sql);
				while(rs.next()){
					//"Tipo";"Nombre";"Dirección";"C.Postal";"Provincia";"Municipio";"Localidad";"Nucleo";"Teléfono 1";"Teléfono 2";"Teléfono 3";"Fax";"Email";"web";"Q Calidad";"Central Reservas";
					Albergue a=new Albergue();
					a.setTipo(rs.getString(2));
					a.setNombre(rs.getString(3));
					a.setDireccion(rs.getString(4));
					a.setCodigoPostal(rs.getInt(5));
					a.setProvincia(rs.getString(6));
					a.setMunicipio(rs.getString(7));
					a.setLocalidad(rs.getString(8));
					a.setNucleo(rs.getString(9));
					a.setTelefono(new String[]{rs.getString(10),rs.getString(11),rs.getString(12)});
					a.setFax(rs.getString(13));
					a.setEmail(rs.getString(14));
					a.setWeb(rs.getString(15));
					a.setQcalidad(rs.getString(16));
					a.setCentralReservas(rs.getString(17));
					lista.add(a);	
				}
				return lista;
	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return path;
	}

}
