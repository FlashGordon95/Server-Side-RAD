<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<form:form modelAttribute = "Customer">
			<table>
				<tr>
					<th>
						<h3>Add new Customer</h3>
					</th>
				</tr>
				<tr>
					<td>
						<label> Customer Name: </label> 
						<!-- Binds an input value to an attribute of a POJO representing a customer -->
						<form:input path="cName"></form:input>
					</td>
					<td><form:errors path = "cName"></form:errors></td>
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