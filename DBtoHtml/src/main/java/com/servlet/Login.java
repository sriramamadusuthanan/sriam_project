package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Employee;
import com.operation.EmployeeOperation;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		
		HttpSession session =request.getSession();
		
		if(username.equals("admin")&& password.equals("admin123")) {
			
			session.setAttribute("admin", "Administration");
			response.sendRedirect("ViewEmployee");
		}else {
			
			EmployeeOperation empOpr = new EmployeeOperation();
			
			Employee empifo= empOpr.UserCheck(username, password);
			
			if(empifo!=null) {
				
				//HttpSession session = request.getSession();
				
				session.setAttribute("eno", empifo.getEmpno());
				session.setAttribute("EmpName", empifo.getEmpname());
				
				response.sendRedirect("employeepage");
			}else {
				response.sendRedirect("ErrorPage.html");
			}
			
			
		}
		
	}

}
