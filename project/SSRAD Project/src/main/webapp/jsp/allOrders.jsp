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
		
		<table>
				<tr>
					<th> Order ID </th>
					<th> Order Date </th>
					<th> Order Qty </th>
					<th> Customer ID </th>
					<th> Customer Name </th>
					<th> Prod ID </th>
					<th> Desc</th>
				</tr>
				
				<c:forEach var="order" items="${AllOrders}">
			
					<tr>
						<td>
							<c:out value="${order.oId}"/>
						</td>
						<td>
							<c:out value="${order.orderDate}"/>
						</td>
						<td>
							<c:out value="${order.qty}"/>
						</td>
						<td>
							<c:out value="${order.cust.cId}"/>
						</td>
						<td>
							<c:out value="${order.cust.cName}"/>
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
	</body>
</html>