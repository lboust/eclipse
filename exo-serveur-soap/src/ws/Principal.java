package ws;

import javax.xml.ws.Endpoint;

public class Principal {

	public static void main(String[] args) {
		Endpoint.publish("http://10.130.10.12:9090/ws/recensement", new RecensementImpl());
	}

}
