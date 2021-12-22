package projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServiceDirecteur {
public static Map<String, Directeur> directeurs = memoire.getDirecteurs();
	
	public static String ajouterDirecteur(Directeur c){
		directeurs.put(c.getIdentifiant(), c);
		return c.getPrenom()+" a ete ajouter avec succes";
	}
	
	public static List<Directeur> afficherDirecteur() {
		return new ArrayList<Directeur>(directeurs.values());
	}
	
	public static Directeur afficherDirecteurUnique(String id){
		Directeur c = directeurs.get(id);
		return c; 
	}
	
	
	public static String supprimerDirecteur(String id){
		Directeur c = directeurs.remove(id);
		return c.getIdentifiant()+" est bien supprimer";
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
