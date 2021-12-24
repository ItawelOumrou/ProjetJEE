package projet;

public class Produit {

	private Long idProduit;
	private String codeBare;
	private String nomP;
	
	public Produit() {}
	
	public Produit(Long idProduit, String codeBare, String nomP) {
		super();
		this.idProduit = idProduit;
		this.codeBare = codeBare;
		this.nomP = nomP;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getCodeBare() {
		return codeBare;
	}

	public void setCodeBare(String codeBare) {
		this.codeBare = codeBare;
	}

	public String getNomP() {
		return nomP;
	}

	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	
	
}
