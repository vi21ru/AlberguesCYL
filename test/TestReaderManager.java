import java.util.List;

import processes.IReader;
import processes.ReaderManager;

public class TestReaderManager {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		IReader reader=ReaderManager.getReader();
		List listaAlbergues=reader.read();
		//System.out.println(listaAlbergues.get(0));
		//System.out.println(listaAlbergues.get(300));
		System.out.println(listaAlbergues.size());
		System.out.println(listaAlbergues.get(0));
	}

}
