<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Add a new product</title>
	
	<!--  Import statements for the styling of the page -->
    <!-- Bootstrap Core CSS -->
    <link href="../../css/bootstrap/bootstrap.min.css" rel="stylesheet">
   
    <!-- Custom CSS -->
    <link href="../../css/simple-sidebar.css" rel="stylesheet">
    <link href="../../css/investment-tables.css" rel="stylesheet">
    
    <!--jQuery -->
    <script src="../../js/jquery.js"></script>
    
    
    
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
	  <tr>
	    <td><a href="/">Home</a></td>
	    <td><a href="/secure/customers/showCustomers">List Customers</a></td>
	    <td><a href="/secure/orders/showProducts">List Products</a></td>
	  </tr>
	  </table>
	
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