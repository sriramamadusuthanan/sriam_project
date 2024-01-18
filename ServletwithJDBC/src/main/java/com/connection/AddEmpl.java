package com.connection;
import com.connection.*;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmpl
 */
@WebServlet("/AddEmpl")
public class AddEmpl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Connection condb = Dbconnection.getConnection();
		
		String empname = request.getParameter("Ename");
		String empjob = request.getParameter("Role");
		String empsalary= request.getParameter("salary");
		
		//System.out.println(empname + empjob + empsalary);
		
		try {
			PreparedStatement ps = condb.prepareStatement("insert child(cname,job,salary) values(?,?,?)");
			ps.setString(1, empname);
			ps.setString(2, empjob);
			ps.setString(3, empsalary);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		response.getWriter().print("<h1>Emploo..added successfuly</h1>");
		
	}

}
