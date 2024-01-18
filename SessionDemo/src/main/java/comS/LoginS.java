package comS;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginS
 */
@WebServlet("/LoginS")
public class LoginS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String Username1 = request.getParameter("Username");
		String Password1 = request.getParameter("Password");
		boolean b = false;
		String userpass[][]= {{"sri","123"},{"ram","1234"},{"madu","12345"}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				
				if(Username1.equals(userpass[i][0]) && Password1.equals(userpass[j][1]))
				{
					//peristence cookies ie will there only till the browser is open
					
					Cookie ck = new Cookie("usern", Username1);
					response.addCookie(ck);
					//ck.setMaxAge(1000);
					
					response.getWriter().print(ck);					
					
					
					HttpSession session = request.getSession();
					session.setAttribute("user", Username1);
					response.sendRedirect("WelcomeS");
					b=true;
					break;
					
				}
			}
		}
		
		if(b==false)
			{
			
				response.sendRedirect("ErrorPage.html");
				
			}
	}

}
