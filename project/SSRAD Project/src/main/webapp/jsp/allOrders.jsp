<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	<!--  Import statements for the styling of the page -->
    <!-- Bootstrap Core CSS -->
    <link href="../../css/bootstrap/bootstrap.min.css" rel="stylesheet">
   
    <!-- Custom CSS -->
    <link href="../../css/simple-sidebar.css" rel="stylesheet">
    <link href="../../css/investment-tables.css" rel="stylesheet">
    
    <!--jQuery -->
    <script src="../../js/jquery.js"></script>
    
    
    <style>
			table {
			    font-family: arial, sans-serif;
			    border-collapse: collapse;
			    width: 90%;
			}
		
			td, th {
			    border: 1px solid #dddddd;
			    text-align: left;
			    padding: 8px;
			}
		
			tr:nth-child(even) {
			    background-color: #dddddd;
			}
		</style>
</head>
<body>
	 <div id="wrapper">
        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <!-- Sidebar menu items -->
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                       Sales Order Web App
                    </a>
                </li>
                
                <li>
                
                    <a href="#" >Products</a>
                    
                    <ul>
                    <li><a href="/secure/products/showProducts">List Products</a></li>
                    <li><a href="/secure/products/addProduct">Add Products</a></li>
                    	
                    	
                    </ul>
                </li>
                <li>
                    <a href="#" >Customers</a>
                    
                    <ul>
                    <li><a href="/secure/customers/showCustomers">List Customers</a></li>
                    <li><a href="/secure/customers/addCustomer">Add Customers</a></li>
                    	
                    	
                    </ul>
                    </li>
               <li>
                    <a href="#" >Orders</a>
                    <ul>
                    <li><a href="/secure/orders/showOrders">List Orders</a></li>
                    <li><a href="/secure/orders/addOrder">Add Orders</a></li>
                    	
                    	
                    </ul>
                    </li>

            </ul>
            <!-- footer for sidemenu -->
            <footer class="footer">
                <div class="footer-container">
                    <p class="text-muted">Made with &#9829;.</p>
                    <p class="text-muted">G00326349</p>
                </div>
            </footer>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <nav class="navbar navbar-full">
            <!-- style=" background-color: #58b3f3; -->
            <div class="container-fluid">
                <!-- Menu toggle used to hide and show sidemenu -->
                <div class="navbar-header">
                    <a class="navbar-brand" href="#menu-toggle" id="menu-toggle">
                        <span class="glyphicon glyphicon-menu-hamburger"></span> Menu
                    </a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse nav-text" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class=" text-secondary"><a href="/" id="demo">Home </a></li>
                    </ul>
                     <ul class="nav navbar-nav navbar-right">
                     	<li class=" text-secondary"><a href="/logout" >Logout </a></li>
                     </ul>
                </div>
                <!--navbar-collapse -->
            </div>
            <!-- container-fluid -->
        </nav>
	  <div id="page-content-wrapper">
            <div class="container-fluid">
        <!-- This section will hold the logic / info for the page. So orders, customers etc -->    
		<h1>Show All Orders</h1>
		<div id="no-more-tables">
		<table>
		<thead class="cf">
				<tr>
					<th> Order ID </th>
					<th> Order Date </th>
					<th> Order Qty </th>
					<th> Customer ID </th>
					<th> Customer Name </th>
					<th> Prod ID </th>
					<th> Desc</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach var="order" items="${AllOrders}">
			
					<tr>
						<td data-title="Order ID">
							<c:out value="${order.oId}"/>
						</td>
						<td data-title="Order Date">
							<c:out value="${order.orderDate}"/>
						</td>
						<td data-title="Order Quantity">
							<c:out value="${order.qty}"/>
						</td>
						<td data-title="Customer ID">
							<c:out value="${order.cust.cId}"/>
						</td>
						<td data-title="Customer Name">
							<c:out value="${order.cust.cName}"/>
						</td>
						<td data-title="Product ID">
							<c:out value="${order.prod.pId}"/>
						</td>
						<td data-title="Product Description">
							<c:out value="${order.prod.pDesc}"/>
						</td>
					
					</tr>
					
				</c:forEach>
				 </tbody>
			</table>
			
			<table>
			  <tr>
			    <td><a href="/">Home</a></td>
			    <td><a href="/secure/orders/addOrder"> Add a new order</a></td>
			    <td><a href="/secure/products/showProducts">List Products</a></td>
			    <td><a href="/secure/customers/showCustomers">List Customers</a></td>
			    <td><a href="/logout">Logout</a></td>
			  </tr>
			  </table>
			  
			  </div>
	 <!-- End of the logic sectiom -->
            </div>
        </div>
        <!--page-content-wrapper -->

    </div>
    <!-- Menu Toggle Script. Used to collapse the menu if you want. -->
    <script>
        $("#menu-toggle").click(function(e) {
            e.preventDefault();
            $("#wrapper").toggleClass("toggled");
        });
        var cur = document.getElementById("demo");
    </script>
    
</body>
</html>