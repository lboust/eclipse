package ws;

import javax.jws.WebService;

@WebService
public class RecensementImpl implements Recensement{

	@Override
	public void jeMeDeclare(String qui) {
		System.out.println(qui);
		
	}

}
