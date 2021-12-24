package projet;

public class Caissier {
	private String nom;
	private String prenom;
	private Long id;
	private String motDePasse;
	
	public Caissier() {}
	
	public Caissier(String nom, String prenom, Long id, String motDePasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}



	
	
	
	
}
