<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello welcome html tag in jsp</h1>
	
	<%="<h1>hello world</h1>" %>
	
	<%
	
		int a =10;
		
	
	%>
	<input type="text" value="<%=a %>">
	<br>
	
	<%
	
		for(int i=0;i<5;i++){
			out.print("i:="+ i+"<br>");
		}
	
	%>
	
	</body>
</html>