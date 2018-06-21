package ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/bonjour")
public class Bonjour {

	
/*	@GET
	@Path("/")
	String ditBonjour() {
		return "Bonjour";
	}*/
	
	@GET
	@Path("/{aqui}")
	public Response ditBonjour2(@PathParam("aqui") String aqui) {
	
		String message = "Bonjour"+ aqui;
		return Response.status(200).entity(message).build();
	}
}
