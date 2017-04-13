<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>All Products</title>
	</head>
	<body>
	
		<h1>All Products Page.</h1>
		
		
			<table>
				<tr>
					<th> Prod ID </th>
					<th> Prod Desc </th>
					<th> Prod Qty </th>
				</tr>
				
				<c:forEach var="product" items="${AllProducts}">
			
					<tr>
						<td>
							<c:out value="${product.pId}"/>
						</td>
						<td>
							<c:out value="${product.pDesc}"/>
						</td>
						<td>
							<c:out value="${product.qtyInStock}"/>
						</td>
					</tr>
					
				</c:forEach>
			</table>
			
	<table>
	  <tr>
	    <td><a href="/">Home</a></td>
	    <td><a href="/secure/products/addProduct"> Add a new product</a></td>
	    <td><a href="/secure/customers/showCustomers">List Customers</a></td>
	    <td><a href="/secure/orders/showOrders">List Orders</a></td>
	    <td><a href="/logout">Logout</a></td>
	  </tr>
	  </table>
			
	</body>
</html>