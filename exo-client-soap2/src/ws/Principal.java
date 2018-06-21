package ws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.poec.soap.RecensementImpl;

public class Principal {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://10.130.10.6:9999/ws/recensement?wsdl");    
			QName qname = new QName("http://formation/", "RecensementImplService");
			Service service = Service.create(url, qname);
			formation.RecensementImpl r = service.getPort(formation.RecensementImpl.class);
			r.jeMeDeclare("toc toc toc c'est Lorraine");
		} catch (Exception e) {
			e.printStackTrace();
		}






	}

}
