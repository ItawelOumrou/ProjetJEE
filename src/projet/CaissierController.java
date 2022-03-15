package projet;



import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/caissier")
public class CaissierController {
	static Map<Long, Stock> stock = memoire.getStocks();
	
		@PUT
		@Path("sortir/{idStock}/{quantite}")
		@Produces(MediaType.APPLICATION_JSON)
		public  String afficher(@PathParam("idStock") Long idStock,@PathParam("quantite") Long quantite) {
			
			Stock stk = stock.get(idStock);
			
			if(quantite <= stk.getQuantite()){
				stk.setQuantite(stk.getQuantite() - quantite);
				return "sortir";
			}
			return "Cette quantite n'existe pas";
			
		}
		

}
