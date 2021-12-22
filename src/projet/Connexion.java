package projet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/connecter")
@Produces("application/json")
public class Connexion {
	Admin admin = new Admin();

	@GET 
	@Produces(MediaType.TEXT_HTML)
	public String connexionAdmin(@QueryParam("login") String login,
			@QueryParam("pass") String pass) {
		
		
		
		if (pass.equals(admin.getPass()) && login.equals(admin.getLogin())) {
			
			return "Bienvenue "+login+", connexion avec succes";
		} else {
			return "Erreur de connexion. Mot de passe incorect";
		}
		
	}
	
	
		
			
		
	
}
