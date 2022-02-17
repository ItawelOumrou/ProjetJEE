package projet;

class Admin {

		private String login;
		private String pass;
		private String nom;
		
		
		
		public Admin(){}
		
		
		public Admin(String login, String pass,String nom) {
			this.login = login;
			this.pass = pass;
			this.nom=nom;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getLogin() {
			return login;
		}
		
		public String getPass() {
			return pass;
		}
		public void setLogin(String login) {
			this.login = login;
		}


		public void setPass(String pass) {
			this.pass = pass;
		}
		

}
