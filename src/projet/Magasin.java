package projet;

public class Magasin {

	
	private String nom;
	private Produit produit = new Produit();
	private Long idD;
	private Long idC;
	
	public Magasin(String nom, Long idD, Long idC, Produit pr) {
		super();
		this.nom = nom;
		this.produit = pr;
		this.idD = idD;
		this.idC = idC;
	}





	public Magasin() {}





	public Produit getPr() {
		return produit;
	}





	public void setPr(Produit pr) {
		this.produit = pr;
	}





	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}





	public Long getIdD() {
		return idD;
	}





	public void setIdD(Long idD) {
		this.idD = idD;
	}





	public Long getIdC() {
		return idC;
	}





	public void setIdC(Long idC) {
		this.idC = idC;
	}

	
	
}
