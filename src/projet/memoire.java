package projet;

import java.util.HashMap;
import java.util.Map;

class memoire {
	
	private static Map<String, Directeur> directeurs = new HashMap<>();
	public static Map<String, Directeur> getDirecteurs(){
		directeurs.put("1",new Directeur("mohamed","beirouk","1","1234"));
		
		return directeurs;
	}
	
	//Pour le  caissier
	private static Map<String, Caissier> caissiers = new HashMap<>();
	public static Map<String, Caissier> getCassiers(){
		caissiers.put("1",new Caissier("AH","IT","1","0012"));
		return caissiers;
	}
	
}
