<%@ page import ="java.sql.*, java.util.ArrayList" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Menu Page</title>
</head>
<body>
	
	<h3 >Welcome <%=session.getAttribute("firstName") %></h3>
	<form>
		Sort by: 
		<select name="sortDropdown">
			<option value="Name">Name</option>
  			<option value="Price">Price</option>	
		</select>
		<br/><br/>
		
		<div style="position:absolute;left:90%">
		<a href="Logout.jsp"> Logout</a></div> <br/>
		
		<table style="width:50%" align="center" border="1">
			<tr>
				<th>Product ID</th> 
    			<th>Product Name</th> 
    			<th>Price</th> 
    			<th>Quantity Available </th>
    			<th>Delivery Type </th>
			</tr>
	
		<% 
		int id=0;
		String name=null;
		Double price=0.0;
		int quantity=0;
		String deliveryType=null;	
		
		ResultSet rs=(ResultSet)session.getAttribute("rsMenu");
			while(rs.next()){	
			id=rs.getInt(1);
			name=rs.getString(2);
			price=rs.getDouble(3);
			quantity=rs.getInt(4);
			deliveryType=rs.getString(5);	
		%>
		<tr>
		<input type="checkbox" name="selectProduct" value=<%=id%>>	<td>id</td> 
											<td>name</td>
											<td>price</td>
											<td><select name="quantityDropdown">
											<%for(int i=0;i<=quantity;i++){%>
												<option value="Quantity">i</option>
											<%}%>
											</select></td>
											<td>deliveryType</td>
		</tr>
		
		<%} %>
		</table>
		
		<script>
			function checkedItems(){}
				ArrayList<int> arrayList = new ArrayList<int>();
				arrayList.
	
		</script>
		
		<input type="button" name="addToCart" value="Add To Cart" onclick="checkedItems()">checked
	
	</form> 
</body>
</html>