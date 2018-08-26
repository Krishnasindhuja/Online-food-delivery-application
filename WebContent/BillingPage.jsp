<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head> 
<meta charset="utf-8">  
<title>Billing Page</title>  
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css"> 
<script src="//code.jquery.com/jquery-1.10.2.js"></script> 
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script> 
<link rel="stylesheet" href="/resources/demos/style.css"> 
<script language="javascript">  
 	$(function(){    
		$( "#datepicker0" ).datepicker({dateFormat:"dd/mm/yy"}); 
    }); 	
</script>
 
 
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
 
  <script type="text/javascript" src="jquery.timepicker.js"></script>
  <link rel="stylesheet" type="text/css" href="jquery.timepicker.css" />
 
  <script type="text/javascript" src="lib/bootstrap-datepicker.js"></script>
  <link rel="stylesheet" type="text/css" href="lib/bootstrap-datepicker.css" />
 
  <script type="text/javascript" src="lib/site.js"></script>
  <link rel="stylesheet" type="text/css" href="lib/site.css" />
  <script language="javascript">  
 	$(function(){
 		$('#timepicker0').timepicker({ 'scrollDefault': 'now' });
 	});
  </script>


<title>Cart Page</title>
</head>
<body>
	<form>
	<h3 >My Bill</h3>
	
	<table>
			<tr>
				<th>Product ID &nbsp;&nbsp;&nbsp;&nbsp;</th> 
    			<th>Product Name &nbsp;&nbsp;&nbsp;&nbsp;</th> 
    			<th>Price &nbsp;&nbsp;&nbsp;&nbsp;</th> 
    			<th>Quantity &nbsp;&nbsp;&nbsp;&nbsp;</th>
    			<th>Total Price &nbsp;&nbsp;&nbsp;&nbsp;</th>
    			<th>Status &nbsp;&nbsp;&nbsp;&nbsp;</th><br>
    			<th>Total Bill</th>
    			<th></th>
			</tr>
	</table><br><br><br><br><br><br><br><br>
	
	Shipping Address: <br/><br/>  
	Door No. :<input type="text" name="door">&nbsp;&nbsp;&nbsp;
	Street :<input type="text" name="street" > <br/><br/> 
	City :<input type="text" name="city" > &nbsp;&nbsp;&nbsp;
	State :<input type="text" name="state" > &nbsp;&nbsp;&nbsp;
	Zipcode :<input type="text" name="pin" ><br/><br/>  
	
	To be Delivered On?&nbsp;&nbsp;<input type="text" name="dateOfDelivery" id="datepicker0"/> 
	At What Time? &nbsp;&nbsp;<input type="text" name="timeOfDelivery" id="timepicker0"/>
	<br/><br/> 
	<tr>
	 	<td>PaymentMode--> </td>
		<td>CreditCard: <input type="radio" name="card" value="Credit Card"></td> 
		<td>DebitCard: <input type="radio" name="card" value="Debit Card"></td>
		<td>NetBanking: <input type="radio" name="card" value="NetBanking"></td>
		<td>CashOnDelivery: <input type="radio" name="card" value="Cash On Delivery"></td>
	</tr><br><br>
	
	<input type="submit" name="submit" value="MakePayment" onclick="/ThankUPage.jsp">
	
	</form>
</body>
</html>