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
	
	public Magasin afficherMagisinUnique(Long id){
		Magasin c = magasins.get(id);
		return c; 
	}
	
	
	public String supprimerMagasin(Long id){
		Magasin d = magasins.remove(id);
		return d.getId()+" est bien supprimer";
	}
	
	public  Magasin modifierMagasin(Magasin c){
		if(c.getId() <= 0)
			return null;
		
		magasins.put(c.getId(), c);
		return c;
	}
}
