import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import beans.Albergue;
import processes.FileReaderProcess;

abstract class TestFileReaderProcess {

public static void main (String[] args) {
		
	//String path="C:\\Users\\Alejandro\\Desktop\\REPOSGIT\\Angel\\AlberguesCYL\\AlberguesCYL\\src\\files\\albergues.csv"; //RUTA ABSOLUTA
	String path="resources\\albergues.csv";//RUTA RELATIVA??
		try {
			FileReaderProcess readerProcess = new FileReaderProcess(path);	
			List<Albergue> albergues = readerProcess.read();
			System.out.println(albergues.size());
			Iterator<Albergue> it = albergues.iterator();
			while(it.hasNext()) {
				Albergue albergue = it.next();
				System.out.println("Nombre Albergue: " + albergue.getTelefono()[0]);
			}
			
			
		}
		catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}
		catch(IOException ex) {
			System.out.println("IOException: " + ex.getMessage());
		}
}
}
