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


/**
 * Servlet Filter implementation class Authentification
 */
@WebFilter("/ws-rest/admin/*")
public class Authentification implements Filter {

    /**
     * Default constructor. 
     */
    public Authentification() {
        // TODO Auto-generated constructor stub
    }
    static Map<String, Admin> admins = memoire.getAdmin();

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
		
		
		Admin ad = admins.get(login);
		if(login.equals(ad.getLogin()) && pass.equals(ad.getPass())){
			
			chain.doFilter(request, response);
		}
		PrintWriter out = response.getWriter();
			out.print("Voun n'avez pas le droit ");
				
		
				
		 
		
		
		//out.print("Vous n'avez pas le droit");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
