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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import demoApp.repository.Rejestruj;

@WebFilter("dodajOsoba.jsp")
public class FiltrRejestruj implements Filter 
{

    public FiltrRejestruj() 
    {
        
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		HttpSession session = ((HttpServletRequest) request).getSession();
		if(!Rejestruj.getLista().contains(session.getId())){
			chain.doFilter(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/registerError.jsp");
			dispatcher.forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
