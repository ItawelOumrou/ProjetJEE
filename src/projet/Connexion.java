package projet;

import java.util.Map;


import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces("application/json")
public class Connexion {
	
	static Map<String, Admin> admins = memoire.getAdmin();

	@GET
	@Path("connecter")
	@Produces(MediaType.TEXT_HTML)
	public String getinfos(@QueryParam("login") String login, @QueryParam("pass") String pass) {
		Admin ad = admins.get(login);
		if(ad==null){
			return "Admin n'existe pas !!";
		}
		else if(!pass.equals(ad.getPass())){
					return "Mot de passe incorrecte !!";
				}
		
		return "Bienvenu Admin !!!";
	}
	
	
	@PUT
	@Path("/modifier")
	@Produces(MediaType.TEXT_HTML)
	// Login avec nouveau password
	public String modifierPass(@QueryParam("login") String login, @QueryParam("pass") String pass,
			@QueryParam("Npass") String Npass) {
		Admin adm = admins.get(login);
		if(adm==null){
			return "Admin n'existe pas !!";
		}
		else if(!pass.equals(adm.getPass())){
		return "Mot de passe est  incorrecte !!";
		}
		else{
				adm.setPass(Npass);
				admins.put(login, adm);
				return "Mot de passe est modifié avec succès";

			}
	}

	
}
