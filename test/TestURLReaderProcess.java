import java.util.Iterator;
import java.util.List;

import beans.Albergue;
import processes.URLReaderProcess;

public abstract class TestURLReaderProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			URLReaderProcess urlReaderProcess=new URLReaderProcess();
			List<Albergue> lista=urlReaderProcess.read();
			System.out.println(lista.size());
			Iterator<Albergue> it = lista.iterator();
			while(it.hasNext()) {
				Albergue albergue = it.next();
				System.out.println("Nombre Albergue: " + albergue.getNombre());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
