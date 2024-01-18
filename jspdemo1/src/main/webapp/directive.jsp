<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp directives</title>
</head>
<body>

	<h1> JSP Directives.</h1>
	<P>there are three directives 
	
		@page
		@include
		@tagline
	
	
	
	
	
	</P>

	<h3>lets see about @page</h3>
	
	
	<%@page import="java.util.*" %>
	
	<p>
	
		language="scripting lanaguage"
		extends="className"
		import="importList"
		session="true | false"
		autoFlush ="true | false"
		
		iserrorPage...
		and lot more 
	
	
	</p>
	
	
	<%
		
	
		out.print("Enter the number to display");
	
		
	
	%>
	
	<form action ="" method= "post">
	
		<input type="text" name="number" placeholder="number">
		<button type="submit">Submit</button>
	
	</form>
	
	<%
	
		String numberstr = request.getParameter("number");
	
		out.print(numberstr);
		
		
	%>
	
	<h3>lets see about @include</h3>
	
	<p>
	
		@include 
		<%-- <%@ include file="filename" %> --%>
		
		we can include the footer in all webpages..instead of crearting it ever time
		<%-- <%@ include file="footer.jsp" %> --%>
	
	
	</p>
	
	<%@include file="footer.jsp" %>

</body>
</html>