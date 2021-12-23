package projet;

public class Directeur {
	private String nom;
	private String prenom;
	private long identifiant;
	private String motDePasse;
	
	
	public Directeur() {}
	
	public Directeur(String nom, String prenom, long identifiant, String motDePasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
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

	public long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(long identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
	
}
