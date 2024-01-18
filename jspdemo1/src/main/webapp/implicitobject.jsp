<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IMplicit Object </title>
</head>
<body>

	<h1>We use few implicit object in jsp..</h1>
	<h2>There are 9 implicit object</h2>
	
	<%
		String username =request.getParameter("userName");
	
		String sessinUsernmae = (String) session.getAttribute("username");
		
		out.print("<h1>hello ,"+username+"<h1>");
		
		out.print(sessinUsernmae);
		
		try{
			int result = 10/0;
			out.print("<p>Result :" +result +"</p>");
			
		}catch(Exception e){
			
			
			out.print("<p>Exception caughted :"+e+"</p>");
			
			
		}
	
	%>

</body>
</html>