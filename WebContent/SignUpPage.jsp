<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UK Bakery</title>
</head>
<body>
	<h1 align="center"> Welcome New User..!! </h1>
	<hr>  <br/><br/>
	<form name="SignUpForm" action="SignUpController" method="post">
		<table>
		<tr>
			<td>First Name: </td>
			<td><input type="text" name= "firstName"></td>
		</tr>
		<tr>
			<td>Last Name: </td>
			<td><input type="text" name= "lastName"></td>
		</tr>
		
		<tr>
			<td>Contact Number: </td>
			<td>
			<script>
				function validateContact(number){    
					    var re = /^[0-9]+$/; 
					    str = number.toString();
					    if (!str.match(re)) 
					    {               
					    	alert("Enter only positive numbers into the Contact Number field");
					    }
					    if(number.length!=10)
					    {
					          alert("Enter 10 digits Contact Number");
					    }
				}
			</script>
			<input type="text" name= "contact" onblur="validateContact(document.SignUpForm.contact.value)"></td>
		</tr>
		
		<tr>
			<td>Password: </td>
			<td>
			<script>
				function validatePasswordLength(){
					if(password.toString().length > 10){
	                    alert("Your password should not be more than 10 chararacters.");
	                }
				}
			</script>
	        	<input type="password" name= "password" onblur="validatePasswordLength()">
	        </td>
		</tr>
		
		<tr>
			<td>Confirm Password:</td>
			<td>
			<script>
				function validatePswd(){
					if(document.SignUpForm.password.value != document.SignUpForm.confirmPassword.value){
						alert("Passwords did not match");
					}
				}
			</script>
				<input type="password" name= "confirmPassword" onblur="validatePswd()">
			</td>
		</tr>
		
		<tr>
			<td>Email(For UserName): </td>
			<td>
			<script>
				function validateEmail(email){    
			    	var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/; 
			    	str = email.toString();
			    	if (!str.match(re)) 
			    	{               
			    	alert("Enter Email Id in Correct Format!");
			    	}
				}
			</script>
			<input type="text" name= "emailId" onblur="validateEmail(document.SignUpForm.emailId.value)">
			</td>
		</tr>
		
		</table>
		
		<script>
				function validate(){
					var firstName=document.SignUpForm.firstName.value;
	                var contact=(String)document.SignUpForm.contact.value;
	                var password=document.SignUpForm.password.value;
	                var emailID= document.SignUpForm.emailId.value;
	                
	                if(firstName==""){
	                    alert("Enter Your Name!");
	                }
	                else if(contact==""){
	                    alert("Enter Your Contact Number!");
	                }
	                else if(password==""){
	                    alert("Enter Your Password!");
	                }
	                else if(email==""){
	                    alert("Enter Your E-Mail ID!");
	                }
				}
		</script>
		
		<input type="submit" name="signUp" value= "SignUp" onclick="validate()">
		
	</form>

</body>
</html>