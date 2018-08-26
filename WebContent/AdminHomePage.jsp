<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Homepage</title>
</head>
<body>
	<h3 >Welcome <%=session.getAttribute("firstName") %></h3>
	<div style="position:absolute;left:90%">
	<a href="BakeryHomePage.jsp"> Logout</a></div> <br/>
	<input type="button" name="Inventory" value= "Inventory Operations" onClick="Inventory.jsp"><br/>
	<input type="button" name="AdminMenu" value= "View Menu" onClick="AdminMenu.jsp"><br/>
	<input type="button" name="OrderStatus" value= "View Order Status" onClick="OrderStatus.jsp"><br/>
	<% if((Integer)session.getAttribute("1")==1){%>
		<input type="button" value="Add Admin" onClick="SignUpPage.jsp"/><br/>
		<input type="button" value="View Admin Details" onClick="AdminDetails.jsp"/>
	<%} %>
</body>
</html>