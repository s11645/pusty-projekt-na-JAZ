package ser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demoApp.repository.Rejestruj;

@WebServlet("/RejestrujServlet")
public class RejestrujServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RejestrujServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		Rejestruj.dodajdoListy(session.getId());
		response.sendRedirect("zarejestrowany.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
