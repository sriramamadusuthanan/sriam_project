package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.operation.EmployeeOperation;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String newpassword = request.getParameter("newPassword");
		String confirmPassword = request.getParameter("ConfPassword");
		HttpSession session = request.getSession();
		
		Integer eno = (Integer)session.getAttribute("eno");
		
		if(newpassword.equals(confirmPassword)) {
			
			
			EmployeeOperation empOpr = new EmployeeOperation();
			
			if(empOpr.ChangePassword(confirmPassword, eno)==true) {
				
				response.sendRedirect("Logut");
				
			}
//			else {
//				
//				response.getWriter().print("<h1>Chech the password properly</h1>");
//				response.getWriter().print("<a href='ChangePassword.html'>Try-again</a>");
//			}
			
		}
	}

}
