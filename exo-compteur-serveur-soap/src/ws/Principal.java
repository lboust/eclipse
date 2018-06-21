package ws;

import javax.xml.ws.Endpoint;

public class Principal {

	public static void main(String[] args) {
				
		Endpoint.publish("http://10.130.10.16:9999/ws/compteurs", new CompteurImpl());
		

	}

}
