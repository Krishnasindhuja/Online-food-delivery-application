<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Details</title>
</head>
<body>
	
	<h3> User Details</h3>
	<form action="OrderStatusController" method="post">
	<table>
		<tr>
    		<th>Order ID</th>
    		<th>Customer Name</th> 
    		<th>Address</th>
    		<th>Quantity Ordered</th>
    		<th>Order Status</th>
		</tr>
		<%while(rs.next()!=null) { %>
			<tr>
				<td><%=rs.getString(1)+" "+rs.getString(2)%></td>
    			<td><%=rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getLong(7)%></td>
    			<td><%=rs.getInt(8)%></td>
    			<td><%=rs.getInt(9)%></td>
    			<td><%=rs.getString(10)%></td>
    		</tr>
    	<%}%>
	</table>
		<input type="submit" name="back" value="Back" onclick="AdminHomePage.jsp">
	</form>
</body>
</html>

select ut.firstName, ut.lastName, at.doorNo, at.street, at.city, at.state, at.pincode, ot.orderID,ot.productQuantity, ot.OrderStatus from UserTable ut, AddressTable at, OrderTable ot where ut.userId=ot.userId and at.addressId=ot.addressId");