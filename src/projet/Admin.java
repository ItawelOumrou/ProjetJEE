package projet;

class Admin {

		private String login;
		private String pass;
		
		
		
		public Admin(){
			this.login="admin";
			this.pass="admin";
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
