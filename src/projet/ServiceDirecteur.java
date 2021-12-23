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
public static Map<String, Caissier> caissiers = memoire.getCassiers();
	
	public static String ajouterCaissier(Caissier d){
		caissiers.put(d.getId(), d);
		return d.getPrenom()+" a ete ajouter avec succes";
	}
	
	public static List<Caissier> afficherCaissier() {
		return new ArrayList<Caissier>(caissiers.values());
	}
	
	public static Caissier afficherCaissierUnique(String id){
		Caissier c = caissiers.get(id);
		return c; 
	}
	
	
	public static String supprimerCaissier(String id){
		Caissier d = caissiers.remove(id);
		return d.getId()+" est bien supprimer";
	}
	
	
}
