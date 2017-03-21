package processes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import beans.Albergue;

public class URLReaderProcess implements IReader{

private String responseBody;
	
	public URLReaderProcess() throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet("http://www.datosabiertos.jcyl.es/web/jcyl/risp/es/turismo/albergues_turisticos/1284211830763.csv");

            // Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            this.responseBody = httpclient.execute(httpget, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);
            //String[] respuesta=responseBody.split("\"");
            //System.out.println(respuesta[0]);
        } finally {
            httpclient.close();
        }
	}
	public List read() throws Exception {
		
		this.responseBody.split("/n");
		List<Albergue> listaAlberges=new ArrayList<Albergue>();
		String linea=responseBody;
		
		
			
			String[] partes=linea.split("\"");
			String miLinea=this.getLine(partes);
			System.out.println("Eliminando primera linea");
			
			String sResult=miLinea.substring(miLinea.indexOf("Albergue"));
			//System.out.println("prueba eliminando primera linea:"+sResult);
			//Dividimos en partes por la palabra albergue...(CHAPUCILLA)
			String[] parts=sResult.split("Albergue");
			//System.out.println(parts.length);
			//System.out.println(parts[0]);
			//System.out.println(parts[300]);
			for(int i=1;i<parts.length;i++){ //CHAPUZA OMITO PRIMERA LINEA
				parts[i]="Albergue"+parts[i];
			}
			
			//System.out.println(parts.length);
			//System.out.println(parts[3]);
			//System.out.println(parts[300]);
			for(int i=1;i<parts.length;i++){ //CHAPUZA OMITO PRIMERA LINEA
				String[] part=parts[i].split(";");
				Albergue a=new Albergue();
				String aux="";
				String[] telefonos = new String[3];
				for(int j=0;j<part.length;j++){
					//"Tipo";"Nombre";"Dirección";"C.Postal";"Provincia";"Municipio";"Localidad";"Nucleo";"Teléfono 1";"Teléfono 2";"Teléfono 3";"Fax";"Email";"web";"Q Calidad";"Central Reservas";
					switch (j) {
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
			}
		//System.out.println(listaAlberges.toString());
		//Pillas las respuesta y tienes que devolver un List de albergues
		return listaAlberges;
	}
	
	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return null;
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
			//System.out.println("Parte: "+partes[i]);
			//System.out.println(result);
		}
		return result;
	}

}
