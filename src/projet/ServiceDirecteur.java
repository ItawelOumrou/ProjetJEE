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
	
	
}
