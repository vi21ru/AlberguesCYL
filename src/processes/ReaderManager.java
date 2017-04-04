package processes;

public class ReaderManager {
	
	public static IReader getReader() throws Exception{
		//Intento crear URLProcess
		try{
			URLReaderProcess urlReaderProcess=new URLReaderProcess();
			System.out.println("Creado reader de tipo URL");
			return urlReaderProcess;
		}catch(Exception ex){
			
			try{
			//String path="C:\\Users\\Alejandro\\Desktop\\REPOSGIT\\Angel\\AlberguesCYL\\AlberguesCYL\\src\\files\\albergues.csv"; //RUTA ABSOLUTA
			String path="src\\files\\albergues.csv";//RUTA RELATIVA??
			FileReaderProcess fileReaderProcess=new FileReaderProcess(path);
			System.out.println("Creando reader de tipo File");
			return fileReaderProcess;
			}catch(Exception ex2){
				DBAReaderProcess dbaReaderProcess=new DBAReaderProcess("");
				System.out.println("Creado reader de tipo DBA");
				return dbaReaderProcess;
				
			}
		}
	}

}
