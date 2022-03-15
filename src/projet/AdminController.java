package projet;

import java.util.List;
import java.util.Map;

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
	
	   static ServiceAdmin Serviceadmin = new ServiceAdmin();
	
	@POST
	@Path("ajouterDirecteur")
	@Produces(MediaType.APPLICATION_JSON)
	public Directeur ajouterDirecteur(Directeur c){
		return Serviceadmin.ajouterDirecteur(c);
	}
	
	@GET
	@Path("afficherDirecteur")
	@Produces(MediaType.APPLICATION_JSON)
	public  List<Directeur> afficherDirecteur(){
		return Serviceadmin.afficherDirecteur();
	}
	
	@GET
	@Path("afficherDirecteurUnique/{id}")
	public   Directeur afficherDirecteurUnique(@PathParam("id") Long id){
		return Serviceadmin.afficherDirecteurUnique(id);
	}
	
	@PUT
	@Path("modifierDirecteur/{id}")
	public   Directeur modifierDirecteur(@PathParam("id") Long id,Directeur dir){
		dir.setIdentifiant(id);
		return Serviceadmin.modifierDirecteur(dir);
	}
	

	
	@DELETE
	@Path("supprimerDirecteur/{id}")
	public  String  supprimerDirecteur(@PathParam("id") Long id){
		 Serviceadmin.supprimerDirecteur(id);
		 return "suppression avec success";
	}
	
	//Pour le caissier
	
	@POST
	@Path("ajouterCaissier")
	public Caissier ajouterCaissier(Caissier c){
		return Serviceadmin.ajouterCaissier(c);
	}
	
	@GET
	@Path("afficherCaissier")
	public List<Caissier> afficherCaissier(){
		return Serviceadmin.afficherCaissier();
	}
	
	@GET
	@Path("afficherCaissierUnique/{id}")
	public Caissier afficherCaissierUnique(@PathParam("id") Long id){
		return Serviceadmin.afficherCaissierUnique(id);
	}
	
	@PUT
	@Path("modifierCaissier/{id}")
	public   Caissier modifierCaissier(@PathParam("id") Long id,Caissier dir){
		dir.setId(id);
		return Serviceadmin.modifierCaissier(dir);
	}
	
	@DELETE
	@Path("supprimerCaissier/{id}")
	public String supprimerCaissier(@PathParam("id") Long id){
		return Serviceadmin.supprimerCaissier(id);
	}

	//pour le magasin
	
	@POST
	@Path("ajouterMagasin")
	@Produces(MediaType.APPLICATION_JSON)
	public Magasin ajouterMagasin(Magasin c){
		//if(memoire.getDirecteurs().containsKey(c.getIdD())==true )
			return Serviceadmin.ajouterMagasin(c);
		//return null;
	}
	
	public static Map<Long, Magasin> magasins = memoire.getMagasins();
	@PUT
	@Path("affecterDirecteur/{idMagasin}/{idDirecteur}")
	@Produces(MediaType.APPLICATION_JSON)
	public String affecterDirecteur(@PathParam("idMagasin") Long idMagasin,@PathParam("idDirecteur") Long idDirecteur){
		Magasin mg = magasins.get(idMagasin);
		
		if(magasins.containsKey(idMagasin)==true ){
			if(memoire.getDirecteurs().containsKey(idDirecteur)==true ){
				if(!(mg.getIdD() == idDirecteur)){
					mg.setIdD(idDirecteur);
					return "Success";
				}
				return "Id Directeur est deja existe";
			}
			return "Id Directeur incorrect";	
		}
			
		return "Id magasin incorrect";
	}
	
	
	@GET
	@Path("afficherMagasin")
	public List<Magasin> afficherMagasin(){
		return Serviceadmin.afficherMagasin();
	}
	
	@GET
	@Path("afficherMagasinUnique/{nom}")
	public Magasin afficherMagasinUnique(@PathParam("nom") String nom){
		return Serviceadmin.afficherMagisinUnique(nom);
	}
	
	public static Map<Long, Directeur> directeurs = memoire.getDirecteurs();
	
	@PUT
	@Path("modifierMagasin/{id}")
	public   String modifierMagasin(@PathParam("id") Long id,Magasin dir){
		dir.setId(id);
		
			if(memoire.getDirecteurs().containsKey(dir.getIdD())==true ){
				
					Serviceadmin.modifierMagasin(dir);
					return "Success";
					
			}
			return "Id Directeur incorrect";
		
	}
	
	@DELETE
	@Path("supprimerMagasin/{id}")
	public String supprimerMagasin(@PathParam("id") Long id){
		return Serviceadmin.supprimerMagasin(id);
	}
	
	//pour le produit
	
		@POST
		@Path("ajouterProduit")
		@Produces(MediaType.APPLICATION_JSON)
		public Produit ajouterProduit(Produit c){
			return Serviceadmin.ajouterProduit(c);
		}
		
		@GET
		@Path("listProduit")
		public List<Produit> afficherProduit(){
			return Serviceadmin.afficherProduit();
		}
		
		@GET
		@Path("afficherProduitUnique/{id}")
		public Produit afficherProduitUnique(@PathParam("id") Long id){
			return Serviceadmin.afficherProduitUnique(id);
		}
		
		@PUT
		@Path("modifierProduit/{id}")
		public   Produit modifierProduit(@PathParam("id") Long id,Produit dir){
			dir.setIdProduit(id);
			return Serviceadmin.modifierProduit(dir);
		}
		
		
		@DELETE
		@Path("supprimerProduit/{id}")
		public String supprimerProduit(@PathParam("id") Long id){
			return Serviceadmin.supprimerProduit(id);
		}
		
		//pour stock
		@POST
		@Path("ajouterStock")
		@Produces(MediaType.APPLICATION_JSON)
		public String ajouterStock(Stock c){
			if(memoire.getMagasins().containsKey(c.getIdM())==true && memoire.getProduits().containsKey(c.getIdP())==true){
				Serviceadmin.ajouterStock(c);
				return "ajouter avec succes";
			}
			return "erreur";
		}
		
		@GET
		@Path("afficherStock")
		@Produces(MediaType.APPLICATION_JSON)
		public  List<Stock> afficherStock(){
			return Serviceadmin.afficherStock();
		}
		
		@GET
		@Path("afficherStockUnique/{id}")
		public Stock afficherStockUnique(@PathParam("id") Long id){
			return Serviceadmin.afficherStockUnique(id);
		}
		
		@PUT
		@Path("modifierStock/{id}")
		public   Stock modifierStock(@PathParam("id") Long id,Stock dir){
			dir.setIdM(id);
			return Serviceadmin.modifierStock(dir);
		}
		
		@DELETE
		@Path("supprimerStock/{id}")
		public String supprimerStock(@PathParam("id") Long id){
			return Serviceadmin.supprimerStock(id);
		}
}

