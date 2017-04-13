<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Show All Orders</h1>
		<c:forEach var="customer" items="${AllCustomers}">
		<div class="custDiv">
		<h1>Id:	<c:out value="${customer.cId}"/> Name:	<c:out value="${customer.cName}"/> </h1>
		<h3><c:out value="${customer.cName}"/>'s Orders</h3>
		<table>
		<tr>
					<th> Order ID </th>
					<th> Order Qty </th>
					<th> Prod ID </th>
					<th> Desc</th>
				</tr>
				<c:forEach var="order" items="${customer.orders}">
			
					<tr>
						<td>
							<c:out value="${order.oId}"/>
						</td>
						
						<td>
							<c:out value="${order.cust.cId}"/>
						</td>
						<td>
							<c:out value="${order.prod.pId}"/>
						</td>
						<td>
							<c:out value="${order.prod.pDesc}"/>
						</td>
					
					</tr>
					
				</c:forEach>
				
			</table>
		
		</div>
			</c:forEach>
			<table>
			  <tr>
			    <td><a href="/">Home</a></td>
			    <td><a href="/secure/customers/addCustomer"> Add a new customer</a></td>
			    <td><a href="/secure/products/showProducts">List Products</a></td>
			    <td><a href="/secure/orders/showOrders">List Orders</a></td>
			    <td><a href="/logout">Logout</a></td>
			  </tr>
			  </table>
				
	</body>
</html>