import java.net.*;
import java.io.*;

public class Visitor extends Thread {
	int id;
	String url;

	public Visitor(int id, String url) {
		this.id = id;
		this.url = url;
	}
	
    public void run(){
    	System.out.println("visitor"+ this.id +" going to site: " + this.url);
		URL url = fetchUrl(this.url);
		try{
	        BufferedReader in = new BufferedReader(
    		new InputStreamReader(url.openStream())
    		); 
//	        String inputLine;
//	        while ((inputLine = in.readLine()) != null)
//	            System.out.println(inputLine);
	        in.close();
		} catch (IOException e) {
            throw new RuntimeException(e);
		}
		System.out.println("visitor"+ this.id + " finished");
      
     }
    
    private URL fetchUrl(String urlAddress){
        URL url = null;
        try {
            url = new URL(urlAddress);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        	return url;
        }
    }
}
