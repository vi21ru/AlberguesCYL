package processes;

import java.util.List;

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
        } finally {
            httpclient.close();
        }
	}
	public List read() throws Exception {
		
		this.responseBody.split("/n");
		//Pillas las respuesta y tienes que devolver un List de albergues
		return null;
		
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
		}
		return result;
	}

}
