import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("C:\\Users\\Alejandro\\Desktop\\workspace\\Mars\\Albergues\\src\\files\\albergues.csv");
		ArrayList<String> lista=new ArrayList<String>();
		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String linea=br.readLine();
			linea=br.readLine();
			
			while(linea!=null){
				String[] partes=linea.split("\"");
				String lineaCompleta="";
				for(int i=0;i<partes.length;i++){
					lineaCompleta+=partes[i];
				}
				lista.add(lineaCompleta);
				
				linea=br.readLine();
			}
			System.out.println(lista.get(0));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
