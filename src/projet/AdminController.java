package projet;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/admin")
public class AdminController {
	
	   static ServiceDirecteur ServiceDirecteur = new ServiceDirecteur();
	
	@POST
	@Path("ajouterDirecteur")
	@Produces(MediaType.APPLICATION_JSON)
	public Directeur ajouterDirecteur(Directeur c){
		return ServiceDirecteur.ajouterDirecteur(c);
	}
	
	@GET
	@Path("afficherDirecteur")
	@Produces(MediaType.APPLICATION_JSON)
	public  List<Directeur> afficherDirecteur(){
		return ServiceDirecteur.afficherDirecteur();
	}
	
	@GET
	@Path("afficherDirecteurUnique/{id}")
	public   Directeur afficherDirecteurUnique(@PathParam("id") Long id){
		return ServiceDirecteur.afficherDirecteurUnique(id);
	}
	
	@PUT
	@Path("modifierDirecteur/{id}")
	public   Directeur modifierDirecteur(@PathParam("id") Long id,Directeur dir){
		dir.setIdentifiant(id);
		return ServiceDirecteur.modifierDirecteur(dir);
	}
	

	
	@DELETE
	@Path("supprimerDirecteur/{id}")
	public  void  supprimerDirecteur(@PathParam("id") Long id){
		 ServiceDirecteur.supprimerDirecteur(id);
	}
	
	//Pour le caissier
	
	@POST
	@Path("ajouterCaissier")
	public Caissier ajouterCaissier(Caissier c){
		return ServiceDirecteur.ajouterCaissier(c);
	}
	
	@GET
	@Path("afficherCaissier")
	public List<Caissier> afficherCaissier(){
		return ServiceDirecteur.afficherCaissier();
	}
	
	@GET
	@Path("afficherCaissierUnique/{id}")
	public Caissier afficherCaissierUnique(@PathParam("id") Long id){
		return ServiceDirecteur.afficherCaissierUnique(id);
	}
	
	@PUT
	@Path("modifierCaissier/{id}")
	public   Caissier modifierCaissier(@PathParam("id") Long id,Caissier dir){
		dir.setId(id);
		return ServiceDirecteur.modifierCaissier(dir);
	}
	
	@DELETE
	@Path("supprimerCaissier/{id}")
	public String supprimerCaissier(@PathParam("id") Long id){
		return ServiceDirecteur.supprimerCaissier(id);
	}

	//pour le magasin
	
	@POST
	@Path("ajouterMagasin")
	@Produces(MediaType.APPLICATION_JSON)
	public Magasin ajouterMagasin(Magasin c){
		return ServiceDirecteur.ajouterMagasin(c);
	}
	
	@GET
	@Path("afficherMagasin")
	public List<Magasin> afficherMagasin(){
		return ServiceDirecteur.afficherMagasin();
	}
	
	@GET
	@Path("afficherMagasinUnique/{id}")
	public Magasin afficherMagasinUnique(@PathParam("id") Long id){
		return ServiceDirecteur.afficherMagisinUnique(id);
	}
	
	@PUT
	@Path("modifierMagasin/{id}")
	public   Magasin modifierMagasin(@PathParam("id") Long id,Magasin dir){
		dir.setId(id);
		return ServiceDirecteur.modifierMagasin(dir);
	}
	
	@DELETE
	@Path("supprimerMagasin/{id}")
	public String supprimerMagasin(@PathParam("id") Long id){
		return ServiceDirecteur.supprimerMagasin(id);
	}
}

