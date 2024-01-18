package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Employee;
import com.operation.EmployeeOperation;

/**
 * Servlet implementation class ViewEmployee
 */
@WebServlet("/ViewEmployee")
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text.html");
		HttpSession session =request.getSession();
		if(session.getAttribute("admin")!=null) 
		{
			PrintWriter out = response.getWriter();
			out.print("	<p style = \"text-align:center;\">\r\n"
					+ "	\r\n"
					+ "		<a href=\"AddEmployee.html\">New Employee</a>\r\n"
					+ "		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| &nbsp;&nbsp;&nbsp;&nbsp;\r\n"
					+ "		<a href =\"ViewEmployee\">View Employee</a>\r\n"
					+ "		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| &nbsp;&nbsp;&nbsp;&nbsp;\r\n"
					+ "		<a href =\"Logut\">Log-out</a>\r\n"
					+ "	\r\n"
					+ "	</p>"
					+ "<hr/>"
					+ "<br>"
					+ "	<br>");
			
			out.print("<h1 style=\"text-align:center\">View Employees</h1><br>");
			
			EmployeeOperation empOpr = new EmployeeOperation();
			List<Employee> empAll= empOpr.ViewEmployee();
			out.print("<table border='1' width='100%'>");
			out.print("<tr><th>Emp No</th> <th>Emp Name</th> <th>Job</th><th>Salary</th><th>Email</th><th>Password</th><th>Operation</th></tr>");
			
				for (Employee e : empAll) {
					
					out.print("<tr>");
					out.print("<td> "+ e.getEmpno()+"</td>");
					out.print("<td> "+ e.getEmpname()+"</td>");
					out.print("<td> "+ e.getJob()+"</td>");
					out.print("<td> "+ e.getSalary()+"</td>");
					out.print("<td> "+ e.getEmail()+"</td>");
					out.print("<td> "+ e.getPassword()+"</td>");
					out.print("<td> <a href='DeleteServlets?eno="+ e.getEmpno()+"'>Delete</a></td>");
					out.print("</tr>");
					
					
				}
				
			out.print("</table>");
		}
		else {
			
			response.sendRedirect("Login.html");
			
			
		}
		//for consoleout 
		
		
	}

}
