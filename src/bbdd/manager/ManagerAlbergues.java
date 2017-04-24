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
	
	public Albergue select(int id)throws SQLException{
		String query ="SELECT * FROM albergues_schema.\"Albergues\" WHERE id ="+ "'" + id + "'";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		Albergue a=new Albergue();
		while(rs.next()){
			
			a.setId(rs.getInt(1));
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
		}
		return a;
		
	}
	public Albergue select(Albergue albergue)throws SQLException{
		String query ="SELECT * FROM albergues_schema.\"Albergues\" WHERE nombre ="+ "'" + albergue.getNombre() + "'";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		Albergue a=new Albergue();
		while(rs.next()){
			
			a.setId(rs.getInt(1));
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
		}
		return a;
		
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
		String sql="INSERT INTO albergues_schema.\"Albergues\"( tipo, nombre, direccion, cpostal, provincia, municipio, localidad,nucleo, telefono1, telefono2, telefono3, fax, email, web, qcalidad,centralreservas) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement pst=conn.prepareStatement(sql);
		Albergue a=(Albergue) obj;
		pst.setString(1, a.getTipo());
		pst.setString(2, a.getNombre());
		pst.setString(3, a.getDireccion());
		pst.setInt(4, a.getCodigoPostal());
		pst.setString(5, a.getProvincia());
		pst.setString(6, a.getMunicipio());
		pst.setString(7, a.getLocalidad());
		pst.setString(8, a.getNucleo());
		pst.setInt(9, Integer.parseInt((a.getTelefono()[0]!=null) ? a.getTelefono()[0] : "0"));
		pst.setInt(10, Integer.parseInt((a.getTelefono()[1]!=null) ? a.getTelefono()[1] : "0"));
		pst.setInt(11, Integer.parseInt((a.getTelefono()[2]!=null) ? a.getTelefono()[2] : "0"));
		pst.setString(12, a.getFax());
		pst.setString(13, a.getEmail());
		pst.setString(14, a.getWeb());
		pst.setString(15, a.getQcalidad());
		pst.setString(16, a.getCentralReservas());
		pst.executeUpdate();
	}

	@Override
	public void update(Object obj)  throws SQLException{
		// TODO Auto-generated method stub
		Albergue a=(Albergue)obj;
		String sql="UPDATE albergues_schema.\"Albergues\"( tipo, nombre, direccion, cpostal, provincia, municipio, localidad,nucleo, telefono1, telefono2, telefono3, fax, email, web, qcalidad,centralreservas)"
		+ " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) WHERE nombre ="+ "'" + a.getNombre() + "'";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1, a.getTipo());
		pst.setString(2, a.getNombre());
		pst.setString(3, a.getDireccion());
		pst.setInt(4, a.getCodigoPostal());
		pst.setString(5, a.getProvincia());
		pst.setString(6, a.getMunicipio());
		pst.setString(7, a.getLocalidad());
		pst.setString(8, a.getNucleo());
		pst.setInt(9, Integer.parseInt((a.getTelefono()[0]!=null) ? a.getTelefono()[0] : "0"));
		pst.setInt(10, Integer.parseInt((a.getTelefono()[1]!=null) ? a.getTelefono()[1] : "0"));
		pst.setInt(11, Integer.parseInt((a.getTelefono()[2]!=null) ? a.getTelefono()[2] : "0"));
		pst.setString(12, a.getFax());
		pst.setString(13, a.getEmail());
		pst.setString(14, a.getWeb());
		pst.setString(15, a.getQcalidad());
		pst.setString(16, a.getCentralReservas());
		pst.executeUpdate();
		
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		
	}

}
