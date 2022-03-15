package projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServiceDirecteur {
	
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
		public static Map<Long, Magasin> magasins = memoire.getMagasins();
		
		public  Magasin ajouterMagasin(Magasin c){
			c.setId((long) (magasins.size()+1));
			magasins.put(c.getId(), c);
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
			
			magasins.put(c.getId(), c);
			return c;
		}
		
		
		//pour stock
public static Map<Long, Stock> stock = memoire.getStocks();
		
		public  Stock ajouterStock(Stock c){
			
			stock.put(c.getIdM(), c);
			return c;
			
		}
		
		public List<Stock> afficherStock() {
			return new ArrayList<Stock>(stock.values());
		}
		
		public Stock afficherStockUnique(Long id){
			Stock c = stock.get(id);
			return c; 
		}
		
		
		public String supprimerStock(Long id){
			stock.remove(id);
			return " suppression avec succes";
		}
		
		public  Stock modifierStock(Stock c){
			
			stock.put(c.getIdM(), c);
			return c;
		}

}
