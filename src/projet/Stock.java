package projet;

public class Stock {
	private Long id;
	private Long idP;
	private Long idM;
	private Long quantite;
	
	public Stock() {}
	
	public Stock(Long id,Long idP, Long idM, Long quantite) {
		super();
		this.id=id;
		this.idP = idP;
		this.idM = idM;
		this.quantite = quantite;
	}

	public Long getIdP() {
		return idP;
	}

	public void setIdP(Long idP) {
		this.idP = idP;
	}

	public Long getIdM() {
		return idM;
	}

	public void setIdM(Long idM) {
		this.idM = idM;
	}

	public Long getQuantite() {
		return quantite;
	}

	public void setQuantite(Long quantite) {
		this.quantite = quantite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
