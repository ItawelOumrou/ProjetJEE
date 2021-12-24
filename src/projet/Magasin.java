package projet;

public class Magasin {

	private Long id;
	private String nom;
	private String adress;
	
	public Magasin() {}

	public Magasin(Long id, String nom, String adress) {
		super();
		this.id = id;
		this.nom = nom;
		this.adress = adress;
	}

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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	
}
