package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operation.EmployeeOperation;

/**
 * Servlet implementation class DeleteServlets
 */
@WebServlet("/DeleteServlets")
public class DeleteServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		EmployeeOperation empOpr = new EmployeeOperation();
		String eno = request.getParameter("eno");
		
		try {
			if(empOpr.DeleteEmployee(Integer.parseInt(eno))>=1) {
				response.sendRedirect("ViewEmployee");
			}else {
				
				response.getWriter().print("<h1>Error<h2>");
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
