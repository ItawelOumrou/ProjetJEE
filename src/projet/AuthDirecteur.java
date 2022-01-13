package projet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/ws-rest/directeur/*")
public class AuthDirecteur implements Filter{

	    /**
	     * Default constructor. 
	     */
	    public AuthDirecteur() {
	        // TODO Auto-generated constructor stub
	    }

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
			String login = request.getParameter("login");
			String pass = request.getParameter("pass");
			if(memoire.getDirecteurs().containsKey(login) ){
				chain.doFilter(request, response);
			}
			
			PrintWriter out = response.getWriter();
			out.print("directeur Vous n'avez pas le droit");
			
		}

		/**
		 * @see Filter#init(FilterConfig)
		 */
		public void init(FilterConfig fConfig) throws ServletException {
			// TODO Auto-generated method stub
		}

}
