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
		private static Map<Long, Magasin> magasins = new HashMap<>();
		public static Map<Long, Magasin> getMagasins(){
			magasins.put((long) 1, new Magasin((long) 1,"Epicerie",(long) 1,null));
			return magasins;
		}
		
		//Pour le  produit
				private static Map<Long, Produit> produits = new HashMap<>();
				public static Map<Long, Produit> getProduits(){
					produits.put((long) 1, new Produit((long) 1,"Biscuit","123oiu4"));
					return produits;
				}
				
				
	//pour admin
private static Map<String , String> admins = new HashMap<>();
	
	public static Map<String ,String> getAdmin(){
		admins.put("admin", "admin");
		return admins;
		
	}
private static Map<String, String> connectionState = new HashMap<>();
	
	public static Map<String,String> getConState(){
		return connectionState;
	}
	
	public static void connecter(String login){
		connectionState.put(login,"admin");
	}
	public static boolean isConnected( String login ){
		if(connectionState.get(login) == null) return false;
		if(connectionState.get(login).equals("admin"))
			return true;
		else
			return false;
	}
	
	//pour Stock
	private static Map<Long, Stock> stock = new HashMap<>();
	public static Map<Long, Stock> getStocks(){
		
		return stock;
	}
}
