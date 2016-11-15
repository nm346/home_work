<!DOCTYPE HTML>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" media="screen" href="/webjars/bootstrap/3.3.7/css/bootstrap.min.css">
<html>
<head>
<title>Order Editing</title>
</head>
<body>
	<h1>New/edit Order Item Information</h1>
	<table>
	<tr>
		<form:form method="POST" modelAttribute="item" action = "/item/add">
		<p>Id:<form:input path="id" readonly="true"/></p>
		<p>Order:<form:input path="orderId" readonly="true"/></p>
		<p>Amount:<form:input path="amount"/></p>
		<p>Product:<form:select path="productId" items="${product}"/>
		<input type="submit" value="submit" class="btn btn-default" />
		</form:form>
	</tr>
	</table>	
</body>
</html>