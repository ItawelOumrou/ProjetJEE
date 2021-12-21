package projet;

import java.util.HashMap;
import java.util.Map;

class memoire {
	
	private static Map<String, Directeur> directeurs = new HashMap<>();
	public static Map<String, Directeur> getDirecteurs(){
		directeurs.put("1",new Directeur("mohamed","beirouk","1","1234"));
		
		return directeurs;
	}
	
}
