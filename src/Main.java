
import java.net.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        URL oracle = new URL("http://oddjobappacademy.herokuapp.com");
        BufferedReader in = new BufferedReader(
        		new InputStreamReader(oracle.openStream())
        		);

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
        System.out.println("finished");
        
        Thread.sleep(3000);

	}

}
