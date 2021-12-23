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
 * Servlet Filter implementation class Authentification
 */
@WebFilter("/ws-restt/*")
public class Authentification implements Filter {

    /**
     * Default constructor. 
     */
    public Authentification() {
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
		
		PrintWriter out = response.getWriter();
		
		
		if(!(login.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))){
			out.print("Vous n'etes pas connecter");
			
		}
		else{
		
			 request.getRequestDispatcher("index.html").forward(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
