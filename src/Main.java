
import java.net.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
//        URL oracle = new URL("http://oddjobappacademy.herokuapp.com");
//        BufferedReader in = new BufferedReader(
//        		new InputStreamReader(oracle.openStream())
//        		);
//
//        String inputLine;
//        while ((inputLine = in.readLine()) != null)
//            System.out.println(inputLine);
//        in.close();
//        System.out.println("finished");
//         
		String target = "http://oddjobappacademy.herokuapp.com";
		int counter = 0;
		  
		while(true){
			Visitor visitor = new Visitor(counter, target);
			visitor.start();
			counter++;
			
			Thread.sleep(30 *   // minutes to sleep
					     60 *   // seconds to a minute
					     1000); // milliseconds to a second
		}
	}

}
