package projet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/ws-rest/dire cteur/*")
public class AuthDirecteur implements Filter{

	    /**
	     * Default constructor. 
	     */
	    public AuthDirecteur() {
	        // TODO Auto-generated constructor stub
	    }
	    
	    static Map<Long, Magasin> magasins = memoire.getMagasins();

		/**
		 * @see Filter#destroy()
		 */
		public void destroy() {
			// TODO Auto-generated method stub
		}

		/**
		 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
		 */
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			String idD = request.getParameter("idD");
			String idM = request.getParameter("idM");
			
			Magasin dr = magasins.get(idM);
			
			if(idD.equals(dr.getIdD()) && idM.equals(dr.getId())){
				chain.doFilter(request, response);
			}
			
			PrintWriter out = response.getWriter();
			out.print(" Vous n'avez pas le droit");
			
		}

		/**
		 * @see Filter#init(FilterConfig)
		 */
		public void init(FilterConfig fConfig) throws ServletException {
			// TODO Auto-generated method stub
		}

}
