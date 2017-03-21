import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import beans.Albergue;
import processes.ReaderProcess;

abstract class TestReaderProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="C:\\Users\\Alejandro\\Desktop\\workspace\\Mars\\Albergues\\src\\files\\albergues.csv";
		
		
		try {
			ReaderProcess rp=new ReaderProcess(path);
			ArrayList<Albergue> lista=(ArrayList<Albergue>) rp.read();
			Iterator it= lista.iterator();
			while(it.hasNext()){
				System.out.println(it.next().toString());
			}
		}catch(FileNotFoundException ex){
			
			System.out.println("Fichero no encontrado");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException: "+e.getMessage());
		}
	}

}
