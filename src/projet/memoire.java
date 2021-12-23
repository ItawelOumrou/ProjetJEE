package projet;

import java.util.HashMap;
import java.util.Map;

class memoire {
	
	private static Map<Long, Directeur> directeurs = new HashMap<>();
	public static Map<Long, Directeur> getDirecteurs(){
		//directeurs.put((long) 1,new Directeur("Ahmed Jiddou","It",1,"1234"));
		
		return directeurs;
	}
	
	//Pour le  caissier
	private static Map<String, Caissier> caissiers = new HashMap<>();
	public static Map<String, Caissier> getCassiers(){
		caissiers.put("1",new Caissier("AH","IT","1","0012"));
		return caissiers;
	}
	
private static Map<String, String> admins = new HashMap<>();
	
	public static Map<String,String> getAdmin(){
		admins.put("admin", "adminy");
		return admins;
	}
private static Map<String, String> connectionState = new HashMap<>();
	
	public static Map<String,String> getConState(){
		return connectionState;
	}
	
	public static void connecter(String login){
		connectionState.put(login, "admin");
	}
	
}
