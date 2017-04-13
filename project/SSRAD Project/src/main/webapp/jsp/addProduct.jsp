<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Add a new product</title>
	</head>
	<body>
		<form:form modelAttribute = "Product">
			<table>
				<tr>
					<th>
						<h3>Add new Product</h3>
					</th>
				</tr>
				<tr>
					<td>
						<label> Product Description: </label> 
						<!-- Binds an input value to an attribute of a POJO representing a product -->
						<form:input path="pDesc"></form:input>
					</td>
					<td><form:errors path = "pDesc"></form:errors></td>
				</tr>
				<tr>
					<td>
						<label> Quantity in stock (Non 0): </label> 
						<!-- Binds an input value to an attribute of a POJO representing a product -->
						<form:input path="qtyInStock"></form:input>
					</td>
					<td><form:errors path = "qtyInStock"></form:errors></td>
				</tr>
				<tr>
				<td>
					<input type="submit" value="Submit" />
				</td>
				</tr>
				
				</table>
				</form:form>
				
				<table>
	  <table>
	  <tr>
	    <td><a href="/">Home</a></td>
	    <td><a href="/secure/customers/showCustomers">List Customers</a></td>
	    <td><a href="/secure/orders/showProducts">List Products</a></td>
	  </tr>
	  </table>
	</body>
</html>