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
		if(memoire.getDirecteurs().containsKey(c.getIdD())==true)
			return ServiceDirecteur.ajouterMagasin(c);
		return null;
	}
	
	@POST
	@Path("ajouterPAM/{nom}")
	@Produces(MediaType.APPLICATION_JSON)
	public Magasin ajouterPAM(@PathParam("nom") String nom,Magasin c){
		c.setNom(nom);
		return ServiceDirecteur.ajouterPAM(c);
	}
	
	@GET
	@Path("afficherMagasin")
	public List<Magasin> afficherMagasin(){
		return ServiceDirecteur.afficherMagasin();
	}
	
	@GET
	@Path("afficherMagasinUnique/{nom}")
	public Magasin afficherMagasinUnique(@PathParam("nom") String nom){
		return ServiceDirecteur.afficherMagisinUnique(nom);
	}
	
	@PUT
	@Path("modifierMagasin/{nom}")
	public   Magasin modifierMagasin(@PathParam("nom") String nom,Magasin dir){
		dir.setNom(nom);
		return ServiceDirecteur.modifierMagasin(dir);
	}
	
	@DELETE
	@Path("supprimerMagasin/{id}")
	public String supprimerMagasin(@PathParam("id") Long id){
		return ServiceDirecteur.supprimerMagasin(id);
	}
	
	//pour le produit
	
		@POST
		@Path("ajouterProduit")
		@Produces(MediaType.APPLICATION_JSON)
		public Produit ajouterProduit(Produit c){
			return ServiceDirecteur.ajouterProduit(c);
		}
		
		@GET
		@Path("stock")
		public List<Produit> afficherProduit(){
			return ServiceDirecteur.afficherProduit();
		}
		
		@GET
		@Path("afficherProduitUnique/{id}")
		public Produit afficherProduitUnique(@PathParam("id") Long id){
			return ServiceDirecteur.afficherProduitUnique(id);
		}
		
		@PUT
		@Path("modifierProduit/{id}")
		public   Produit modifierProduit(@PathParam("id") Long id,Produit dir){
			dir.setIdProduit(id);
			return ServiceDirecteur.modifierProduit(dir);
		}
		
		@DELETE
		@Path("supprimerProduit/{id}")
		public String supprimerProduit(@PathParam("id") Long id){
			return ServiceDirecteur.supprimerProduit(id);
		}
		
		
}

