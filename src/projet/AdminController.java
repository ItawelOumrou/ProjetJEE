package projet;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/admin")
public class AdminController {
	
	static ServiceDirecteur service = new ServiceDirecteur();
	
	@POST
	@Path("ajouterDirecteur")
	public String ajouterDirecteur(Directeur c){
		return ServiceDirecteur.ajouterDirecteur(c);
	}
	
	@GET
	@Path("afficherDirecteur")
	public List<Directeur> afficherDirecteur(){
		return ServiceDirecteur.afficherDirecteur();
	}
	
	@GET
	@Path("afficherDirecteurUnique/{id}")
	public Directeur afficherDirecteurUnique(@PathParam("id") String id){
		return ServiceDirecteur.afficherDirecteurUnique(id);
	}
	

	
	@DELETE
	@Path("supprimerDirecteur/{id}")
	public String supprimerClient(@PathParam("id") String id){
		return ServiceDirecteur.supprimerDirecteur(id);
	}
	
	//Pour le caissier
	
	@POST
	@Path("ajouterCaissier")
	public String ajouterCaissier(Caissier c){
		return ServiceDirecteur.ajouterCaissier(c);
	}
	
	@GET
	@Path("afficherCaissier")
	public List<Caissier> afficherCaissier(){
		return ServiceDirecteur.afficherCaissier();
	}
	
	@GET
	@Path("afficherCaissierUnique/{id}")
	public Caissier afficherCaissierUnique(@PathParam("id") String id){
		return ServiceDirecteur.afficherCaissierUnique(id);
	}
	

	
	@DELETE
	@Path("supprimerCaissier/{id}")
	public String supprimerCaissier(@PathParam("id") String id){
		return ServiceDirecteur.supprimerCaissier(id);
	}

}

