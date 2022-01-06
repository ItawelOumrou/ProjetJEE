package projet;


import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/connecter")
@Produces("application/json")
public class Connexion {
	static ServiceDirecteur ServiceDirecteur = new ServiceDirecteur();

	@GET 
	@Produces(MediaType.TEXT_HTML)
	public String connexionAdmin(@QueryParam("login") String login,@QueryParam("pass") String pass) {
		
		if(!memoire.getAdmin().containsKey(login))
			return "("+login+"): Cet identifiant n'existe pas.";
		
		
		if ( memoire.getAdmin().containsKey(login) && pass.equals(memoire.getAdmin().get(login))) {
		//	memoire.connecter(login);
			
			return "Bienvenue "+login+", connexion avec succes";
		} else {
			return "Erreur de connexion. Mot de passe incorect";
		}
	}
	
	
	public static Map<String ,String> admins = memoire.getAdmin();
	@PUT
	@Path("modifierMdp")
	public   String modifierMdp(@QueryParam("login") String login,@QueryParam("pass") String pass,@QueryParam("newpass") String newpass){
		if(memoire.getAdmin().containsKey(login) && pass.equals(memoire.getAdmin().get(login))){
		
				pass=newpass;
			   admins.put(login,pass);
				return "changer";
		}
		
		return "non changer";
		
	}
	
}
