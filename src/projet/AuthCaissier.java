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

/**
 * Servlet Filter implementation class AuthCaissier
 */
@WebFilter("/ws-rest/caissie r/*")
public class AuthCaissier implements Filter {

    /**
     * Default constructor. 
     */
    public AuthCaissier() {
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
		//String idC = request.getParameter("idC");
		//String idM = request.getParameter("idM");
		if(memoire.getMagasins().containsKey(1)){
			//chain.doFilter(request, response);
			//&& idC.equals(memoire.getMagasins().get(idM)
			PrintWriter out = response.getWriter();
			out.print("Hi");
		}
		
		PrintWriter out = response.getWriter();
		out.print("Vous n'avez pas le droit");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
