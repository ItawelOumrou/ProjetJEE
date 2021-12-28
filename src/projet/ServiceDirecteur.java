package projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServiceDirecteur {
	
public static Map<Long, Directeur> directeurs = memoire.getDirecteurs();
	
	public  Directeur ajouterDirecteur(Directeur c){
		c.setIdentifiant(directeurs.size()+1);
		directeurs.put(c.getIdentifiant(), c);
		return c;
		
	}
	
	public    List<Directeur> afficherDirecteur() {
		return new ArrayList<Directeur>(directeurs.values());
	}
	
	public  Directeur  afficherDirecteurUnique(Long id){
		Directeur c = directeurs.get(id);
		return c; 
	}
	
	
	public  void supprimerDirecteur(Long id){
		  directeurs.remove(id);
		  
		
	}
	
	public  Directeur modifierDirecteur(Directeur c){
		if(c.getIdentifiant() <= 0)
			return null;
		
		directeurs.put(c.getIdentifiant(), c);
		return c;
	}
	
	
	//Pour le caissier
public static Map<Long, Caissier> caissiers = memoire.getCassiers();
	
	public Caissier ajouterCaissier(Caissier d){
		d.setId((long) (caissiers.size()+1));
		caissiers.put(d.getId(), d);
		return d;
	}
	
	public List<Caissier> afficherCaissier() {
		return new ArrayList<Caissier>(caissiers.values());
	}
	
	public Caissier afficherCaissierUnique(Long id){
		Caissier c = caissiers.get(id);
		return c; 
	}
	
	
	public String supprimerCaissier(Long id){
		Caissier d = caissiers.remove(id);
		return d.getId()+" est bien supprimer";
	}
	
	public  Caissier modifierCaissier(Caissier c){
		if(c.getId() <= 0)
			return null;
		
		caissiers.put(c.getId(), c);
		return c;
	}
	
	//pour le produit
	public static Map<Long, Produit> produits = memoire.getProduits();
	
	public  Produit ajouterProduit(Produit c){
		c.setIdProduit((long) (produits.size()+1));
		produits.put(c.getIdProduit(), c);
		return c;
		
	}
	
	public List<Produit> afficherProduit() {
		return new ArrayList<Produit>(produits.values());
	}
	
	public Produit afficherProduitUnique(Long id){
		Produit c = produits.get(id);
		return c; 
	}
	
	
	public String supprimerProduit(Long id){
		Produit d = produits.remove(id);
		return d.getIdProduit()+" est bien supprimer";
	}
	
	public  Produit modifierProduit(Produit c){
		if(c.getIdProduit() <= 0)
			return null;
		
		produits.put(c.getIdProduit(), c);
		return c;
	}
	
	//pour le magasin
		public static Map<String, Magasin> magasins = memoire.getMagasins();
		
		public  Magasin ajouterMagasin(Magasin c){
			
			magasins.put(c.getNom(), c);
			return c;
			
		}
		
		public List<Magasin> afficherMagasin() {
			return new ArrayList<Magasin>(magasins.values());
		}
		
		public Magasin afficherMagisinUnique(String nom){
			Magasin c = magasins.get(nom);
			return c; 
		}
		
		
		public String supprimerMagasin(Long id){
			Magasin d = magasins.remove(id);
			return d.getNom()+" est bien supprimer";
		}
		
		public  Magasin modifierMagasin(Magasin c){
			
			magasins.put(c.getNom(), c);
			return c;
		}
		
		public  Magasin ajouterPAM(Magasin c){
			magasins.put(c.getNom(), c);
			return c;
			
		}
		
		//Pour Admin
		public static Map<String, Admin> admins = memoire.getAdmin();
		
		public  Admin modifierMdp(Admin c){
			
			admins.put(c.getLogin(), c);
			return c;
		}
		public List<Admin> afficher() {
			return new ArrayList<Admin>(admins.values());
		}
		
}
