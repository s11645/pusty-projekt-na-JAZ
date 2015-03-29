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

import demoApp.repository.Licznik;


@WebFilter("/FiltrLicznik","form.jsp","dodajOsoba.jsp")
public class FiltrLicznik implements Filter {

    public FiltrLicznik() 
    {
        
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		if(Licznik.getLicznik()>0)
		{
			chain.doFilter(request, response);
		}
		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/BladLicznik.jsp");
			dispatcher.forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
