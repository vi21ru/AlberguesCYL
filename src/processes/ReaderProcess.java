package processes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Albergue;

public class ReaderProcess implements IReader{


	private String path;
	private File file;
	public ReaderProcess(String path)  throws IOException{

		this.path = path;
		file=new File(this.path);
	}
	@Override
	public List<Albergue> read() throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader(this.file);
		BufferedReader br=new BufferedReader(fr); 
		List<Albergue> listaAlberges=new ArrayList<Albergue>();
		String linea=br.readLine();
		linea=br.readLine();
		while(linea!=null){
			String[] partes=linea.split("\"");
			String miLinea=this.getLine(partes);
			String[] part=miLinea.split(";");
			Albergue a=new Albergue();
			String aux="";
			String[] telefonos = new String[3];
			for(int i=0;i<part.length;i++){
				//"Tipo";"Nombre";"Dirección";"C.Postal";"Provincia";"Municipio";"Localidad";"Nucleo";"Teléfono 1";"Teléfono 2";"Teléfono 3";"Fax";"Email";"web";"Q Calidad";"Central Reservas";
				switch (i) {
					case 0: {a.setTipo(part[0]);break;}
					case 1: {a.setNombre(part[1]);break;}
					case 2: {a.setDireccion(part[2]);break;}
					case 3: {a.setCodigoPostal(Integer.parseInt(part[3]));break;}
					case 4: {a.setProvincia(part[4]);break;}
					case 5: {a.setMunicipio(part[5]);break;}
					case 6: {a.setLocalidad(part[6]);break;}
					case 7: {a.setNucleo(part[7]);break;}
					case 8: {telefonos[0]=part[8];break;}
					case 9: {telefonos[1]=part[9];break;}
					case 10: {telefonos[2]=part[10];break;}
					case 11: {a.setFax(part[11]);break;}
					case 12: {a.setEmail(part[12]);break;}
					case 13: {a.setWeb(part[13]);break;}
					case 14: {a.setQcalidad(part[14]);break;}
					case 15: {a.setCentralReservas(part[15]);break;}
						
				}
				
			}
			listaAlberges.add(a);
			linea=br.readLine();
		}
		
		return listaAlberges;
	}
	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return this.path;
	}
	private int[] getPhones(String[] sPhones){
		int[] phones=new int[3];
		for(int i=0;i<sPhones.length;i++){
			try {
				phones[i]=(sPhones[i] !=null && !sPhones[i].equals(""))?Integer.parseInt(sPhones[i]):0;
			}
			catch(NumberFormatException ex) {
				System.out.println("Telefono con formato no correcto: " + sPhones[i]);
			}
		}
		return phones;
	}
	private int getPhones(String sPhones){
		int phones;
		
			phones=(!sPhones.equals(""))?Integer.parseInt(sPhones):0;
		
		return phones;
	}
	private String getLine(String[] partes){
		String result="";
		for(int i=0;i<partes.length;i++){
			result+=partes[i];
		}
		return result;
	}
}
