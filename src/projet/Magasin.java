package projet;

public class Magasin {

	private Long id;
	private String nom;
	private Long idD;
	private Long idC;
	
	public Magasin(Long id,String nom, Long idD, Long idC) {
		this.id=id;
		this.nom = nom;
		this.idD = idD;
		this.idC = idC;
	}
	
	public Magasin() {}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
