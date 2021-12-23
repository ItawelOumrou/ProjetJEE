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
	 static ServiceDirecteur ServiceDirecteur = new ServiceDirecteur();

	@GET 
	@Produces(MediaType.TEXT_HTML)
	public String connexionAdmin(@QueryParam("login") String login,
			@QueryParam("pass") String pass) {
		
		
		
		if(!memoire.getAdmin().containsKey(login))
			return "("+login+"): Cet identifiant n'existe pas.";
		
		
		if (pass.equals(memoire.getAdmin().get(login))) {
			memoire.connecter(login);
			
			return "Bienvenue "+login+", connexion avec succes";
		} else {
			return "Erreur de connexion. Mot de passe incorect";
		}
	}
			
		
	
}
