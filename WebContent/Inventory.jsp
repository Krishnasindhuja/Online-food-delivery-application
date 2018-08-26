<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> New Products</title>
</head>
<body>
	
	<h3> Add New Products </h3>
	<form name="InventoryForm" action="InventoryController" method="get">
	
	Product Name : <input type="text" name="productName" >
	Product Price : <input type="text" name="productPrice" >
	Product Quantity : <input type="text" name="productQuantity" >
	Mode of Delivery : <select name="deliveryTypeDropdown">
							<option value="deliveryType">Home Delivery</option>
					   </select>
	
	<div style="position:absolute;left:90%">
	<a href="AdminHomePage.jsp"> Back</a></div> <br/>
	
	<script>
		function validateInsertion(){
			if(document.InventoryForm.productName.value==null 
				|| document.InventoryForm.productPrice.value==null
				|| document.InventoryForm.productQuantity.value==null )
						
				alert("All fields to be filled");
		}
	</script>
	
	<input type="submit" name="add" value="Add Product" onblur="validateInsertion()" onclick="<%=session.setAttribute("add",1)%>"> &nbsp;&nbsp;&nbsp;
	<input type="submit" name="update" value="Update Product" onclick="<%=session.setAttribute("delete",2)%>"> &nbsp;&nbsp;&nbsp;
	<input type="submit" name="delete" value="Delete Product" onclick="<%=session.setAttribute("update",3)%>"> &nbsp;&nbsp;&nbsp;
	<input type="submit" name="display" value="Display table" onclick="<%=session.setAttribute("display",4)%>">
	
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
		</tr>
	</table>
	</form>
	
</body>
</html>