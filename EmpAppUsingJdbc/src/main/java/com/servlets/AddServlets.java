package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.operation.Empliyeeoperation;

/**
 * Servlet implementation class AddServlets
 */
@WebServlet("/AddServlets")
public class AddServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String cname = request.getParameter("Ename");
		String job = request.getParameter("Role");
		String Sal = request.getParameter("txtsalary");
		String email = request.getParameter("txtemail");
		String passwors = request.getParameter("txtpass");
		
		Employee emp = new Employee(0, cname,job, Integer.parseInt(Sal) ,email,passwors);
		
		Empliyeeoperation empOpr = new Empliyeeoperation();
		if(empOpr.AddNewEmployee(emp)) {
			response.sendRedirect("AddEmployee.html");
		}else {
			
			response.getWriter().print("Error emp");
		}
		
	}

}
