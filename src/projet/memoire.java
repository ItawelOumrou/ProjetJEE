package projet;

import java.util.HashMap;
import java.util.Map;

class memoire {
	
	private static Map<Long, Directeur> directeurs = new HashMap<>();
	public static Map<Long, Directeur> getDirecteurs(){
		directeurs.put((long) 1,new Directeur("Ahmed Jiddou","It",1,"1234"));
		directeurs.put((long) 2,new Directeur("Ahmed","It",2,"1ws234"));
		directeurs.put((long) 3,new Directeur("Jiddou","Itawel",3,"123dx4"));
		directeurs.put((long) 4,new Directeur("Ahmed taleb","Itawel",4,"1234rr"));
		return directeurs;
	}
	
	//Pour le  caissier
	private static Map<Long, Caissier> caissiers = new HashMap<>();
	public static Map<Long, Caissier> getCassiers(){
		caissiers.put((long) 1,new Caissier("AH","IT",(long) 1,"0012"));
		caissiers.put((long) 2,new Caissier("Sidi","Nez",(long) 2,"001xc2"));
		caissiers.put((long) 3,new Caissier("Ahmedou","Am",(long) 3,"0dxxx012"));
		caissiers.put((long) 4,new Caissier("Diallo","Gabriel",(long) 4,"00ee12"));
		return caissiers;
	}
	
	//Pour le  magasin
		private static Map<Long, Magasin> magasins = new HashMap<>();
		public static Map<Long, Magasin> getMagasins(){
			magasins.put((long) 1, new Magasin((long) 1,"Epicerie",(long) 1,null));
			magasins.put((long) 2, new Magasin((long) 2,"Epicerie 3",(long) 1,null));
			magasins.put((long) 3, new Magasin((long) 3,"Epicerie 3",(long) 2,null));
			magasins.put((long) 4, new Magasin((long) 4,"Epicerie 4",(long) 3,null));
			return magasins;
		}
		
		//Pour le  produit
				private static Map<Long, Produit> produits = new HashMap<>();
				public static Map<Long, Produit> getProduits(){
					produits.put((long) 1, new Produit((long) 1,"Biscuit","123oiu4"));
					produits.put((long) 2, new Produit((long) 2,"Biscuit ser9ella","123odiu4"));
					produits.put((long) 3, new Produit((long) 3,"Sardine","1234"));
					produits.put((long) 4, new Produit((long) 4,"Oreo","123o4"));
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
