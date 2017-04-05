package bbdd.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import beans.Albergue;

public class ManagerAlbergues implements IManager{

	private Connection conn;
	public ManagerAlbergues(){
		try {
			conn=DBManager.getConnection("jdbc:postgresql://localhost:5432/Albergues","postgres","admin");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	@Override
	public Collection select() throws SQLException {
		// TODO Auto-generated method stub
		String query="Select * from albergues_schema.\"Albergues\"";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		List<Albergue> lista=new ArrayList<Albergue>();
		while(rs.next()){
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
	public void insert(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		String sql="INSERT INTO albergues_schema.\"Albergues\"(id, tipo, nombre, direccion, cpostal, provincia, municipio, localidad,nucleo, telefono1, telefono2, telefono3, fax, email, web, qcalidad,centralreservas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement pst=conn.prepareStatement(sql);
		Albergue a=(Albergue) obj;
		pst.setString(2, a.getTipo());
		pst.setString(3, a.getTipo());
		pst.setString(2, a.getTipo());
		pst.setString(2, a.getTipo());
		pst.setString(2, a.getTipo());
		pst.setString(2, a.getTipo());
		pst.setString(2, a.getTipo());
		pst.setString(2, a.getTipo());
		pst.setString(2, a.getTipo());
		pst.setString(2, a.getTipo());
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		
	}

}
