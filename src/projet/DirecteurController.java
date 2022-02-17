package projet;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/directeur")

public class DirecteurController {

	static ServiceDirecteur ServiceDirecteur = new ServiceDirecteur();
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
		if(memoire.getDirecteurs().containsKey(c.getIdD())==true )
			return ServiceDirecteur.ajouterMagasin(c);
		return null;
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
	
	//pour le produit
	
		@POST
		@Path("ajouterProduit")
		@Produces(MediaType.APPLICATION_JSON)
		public Produit ajouterProduit(Produit c){
			return ServiceDirecteur.ajouterProduit(c);
		}
		
		@GET
		@Path("listProduit")
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
		
		//pour stock
		@POST
		@Path("ajouterStock")
		@Produces(MediaType.APPLICATION_JSON)
		public String ajouterStock(Stock c){
			if(memoire.getMagasins().containsKey(c.getIdM())==true && memoire.getProduits().containsKey(c.getIdP())==true){
				ServiceDirecteur.ajouterStock(c);
				return "ajouter avec succes";
			}
			return "erreur";
		}
		
		@GET
		@Path("afficherStock")
		@Produces(MediaType.APPLICATION_JSON)
		public  List<Stock> afficherStock(){
			return ServiceDirecteur.afficherStock();
		}
		
		@GET
		@Path("afficherStockUnique/{id}")
		public Stock afficherStockUnique(@PathParam("id") Long id){
			return ServiceDirecteur.afficherStockUnique(id);
		}
		
		@PUT
		@Path("modifierStock/{id}")
		public   Stock modifierStock(@PathParam("id") Long id,Stock dir){
			dir.setIdM(id);
			return ServiceDirecteur.modifierStock(dir);
		}
		
		@DELETE
		@Path("supprimerStock/{id}")
		public String supprimerStock(@PathParam("id") Long id){
			return ServiceDirecteur.supprimerStock(id);
		}
}
