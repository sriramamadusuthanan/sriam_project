package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.operation.EmployeeOperation;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String ename= request.getParameter("name");
		String job = request.getParameter("job");
		String salary = request.getParameter("salary");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Employee emp = new Employee(0,ename,job,Integer.parseInt(salary),email,password);
		
		EmployeeOperation empOpr = new EmployeeOperation();
		if(empOpr.AddNewEmployee(emp)) {
			response.sendRedirect("ViewEmployee");
		}else {
			
			response.getWriter().print("Eorror loging");
		}
		
	}

}
