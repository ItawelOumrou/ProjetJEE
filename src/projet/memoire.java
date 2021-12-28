package projet;

import java.util.HashMap;
import java.util.Map;

class memoire {
	
	private static Map<Long, Directeur> directeurs = new HashMap<>();
	public static Map<Long, Directeur> getDirecteurs(){
		directeurs.put((long) 1,new Directeur("Ahmed Jiddou","It",1,"1234"));
		
		return directeurs;
	}
	
	//Pour le  caissier
	private static Map<Long, Caissier> caissiers = new HashMap<>();
	public static Map<Long, Caissier> getCassiers(){
		//caissiers.put((Long) 1,new Caissier("AH","IT",1,"0012"));
		return caissiers;
	}
	
	//Pour le  magasin
		private static Map<String, Magasin> magasins = new HashMap<>();
		public static Map<String, Magasin> getMagasins(){
			//magasins.put("Epicerie", new Magasin("Epicerie",1,null,(1,"120ouw","Biscuit")));
			return magasins;
		}
		
		//Pour le  produit
				private static Map<Long, Produit> produits = new HashMap<>();
				public static Map<Long, Produit> getProduits(){
					
					return produits;
				}
	
private static Map<String , Admin> admins = new HashMap<>();
	
	public static Map<String ,Admin> getAdmin(){
		admins.put("admin",new Admin("admin","admin"));
		return admins;
		
	}
private static Map<String, String> connectionState = new HashMap<>();
	
	public static Map<String,String> getConState(){
		return connectionState;
	}
	
	public static void connecter(String login){
		connectionState.put(login,"admin");
	}
	
}
