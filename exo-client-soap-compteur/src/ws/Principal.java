package ws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;



public class Principal {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://10.130.10.16:9999/ws/compteurs?wsdl");    
			QName qname = new QName("http://ws/", "CompteurImplService");
			Service service = Service.create(url, qname);
			ws.CompteurImpl r = service.getPort(ws.CompteurImpl.class);
			int compteur =0;
			while (true)
			{
				r.ecrire("Lorraine", compteur++);
				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}






	}

}
