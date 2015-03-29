package ser;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("dodajOsoba.jsp")
public class filtrEmail implements Filter {

    public filtrEmail() 
    {
    	
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		String email = request.getParameter("email");
		String potemail = request.getParameter("potemail");
		
		if(email!=null && !email.equals("") && email.equals(potemail) && (email.hashCode() == potemail.hashCode())){
			chain.doFilter(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/emailError.jsp");
			dispatcher.forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
