package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Employee;
import com.operation.EmployeeOperation;

/**
 * Servlet implementation class employeepage
 */
@WebServlet("/employeepage")
public class employeepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeepage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		out.print("	<p style = \"text-align:center;\">\r\n"
				+ "	\r\n"
				+ "		<a href=\"employeepage\">Home</a>\r\n"
				+ "		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| &nbsp;&nbsp;&nbsp;&nbsp;\r\n"
				+ "		<a href =\"ChangePassword.html\">Change Password</a>\r\n"
				+ "		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| &nbsp;&nbsp;&nbsp;&nbsp;\r\n"
				+ "		<a href =\"Logut\">Log-out</a>\r\n"
				+ "	\r\n"
				+ "	</p>"
				+ "<hr/>"
				+ "<br>"
				+ "	<br>");

		if( session.getAttribute("EmpName")!=null)
		{
		
			String ename = (String) session.getAttribute("EmpName");
			int eno = (int)session.getAttribute("eno");
			
			out.print("<h1>Welcome : " + ename + "</h1>");
			
			EmployeeOperation empOrp = new EmployeeOperation();
			
			Employee emp = empOrp.SearchEmployee(eno);
			empOrp.SearchEmployee(eno);
			
			out.print("<table border='1' width='100%'>");
			out.print("<tr><th>Emp No</th> <th>Emp Name</th> <th>Job</th><th>Salary</th><th>Email</th><th>Password</th></tr>");
			
				
					
					out.print("<tr>");
					out.print("<td> "+ emp.getEmpno()+"</td>");
					out.print("<td> "+ emp.getEmpname()+"</td>");
					out.print("<td> "+ emp.getJob()+"</td>");
					out.print("<td> "+ emp.getSalary()+"</td>");
					out.print("<td> "+ emp.getEmail()+"</td>");
					out.print("<td> "+ emp.getPassword()+"</td>");
					//out.print("<td> <a href='DeleteServlets?eno="+ emp.getEmpno()+"'>Delete</a></td>");
					out.print("</tr>");
					
					
				
				
			out.print("</table>");
			out.print("<a href ='Logut'>Log-out</a>");
		}
		else{
			
			response.sendRedirect("Login.html");
		}
		
		
		
		
		
	}

}
