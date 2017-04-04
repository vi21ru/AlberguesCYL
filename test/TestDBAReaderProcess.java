import java.util.List;

import beans.Albergue;
import processes.DBAReaderProcess;

public class TestDBAReaderProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBAReaderProcess dbRP=new DBAReaderProcess("jdbc:postgresql://localhost:5432/Albergues","postgres","admin");
		try {
			List<Albergue> lista=dbRP.read();
			for (Albergue a : lista) {
				System.out.println(a.toString());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
