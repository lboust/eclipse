package ws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Principal {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://10.130.10.12:9090/ws/recensement?wsdl");    
			QName qname = new QName("http://ws/", "RecensementImplService");
			Service service = Service.create(url, qname);
			Recensement r = service.getPort(Recensement.class);
			r.jeMeDeclare("Lorraine");
		} catch (Exception e) {
			e.printStackTrace();
		}






	}

}
