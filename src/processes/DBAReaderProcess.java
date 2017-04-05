package processes;

import java.util.List;

import bbdd.manager.ManagerAlbergues;

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
		
		ManagerAlbergues ma=new ManagerAlbergues();
		return (List) ma.select();
		
		
		
	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return path;
	}

}
