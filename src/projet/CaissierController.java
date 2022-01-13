package projet;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/caissier")
public class CaissierController {

		@GET
		@Path("/afficher")
		@Produces(MediaType.APPLICATION_JSON)
		public  String afficher(){
			return "Hello caissier ";
		}
		
	

}
