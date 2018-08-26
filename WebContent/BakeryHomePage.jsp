<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UK Bakery</title>
</head>
<body>
	<h2 align="center">Welcome to UK Bakery</h2>
	<hr>
	<marquee>Special offers till 25th dec.......!!!!!!!!</marquee>
	<hr>
	<br/><br/>
	
	<img src="Stephen Hawkins.jpg" height="150" width="200">
	<img align="right" src="Stephen Hawkins.jpg" height="150" width="200"><br/><br/>
	<img src="Lighthouse.jpg" height="150" width="200">
	<img align="right" src="Lighthouse.jpg" height="150" width="200"><br/><br/>
	<img src="Tulips.jpg" height="150" width="200">
	<img align="right" src="Tulips.jpg" height="150" width="200"><br/><br/>
	
	<form action="LoginController" method="post">
	Username: <input type="text" name="username"><br/>
	Password: <input type="password" name="password"><br/>
	<input type="submit" value="Login"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	
	New Customer?<a  href="SignUpPage.jsp">SignUp</a>
	</form>
	
</body>
</html>