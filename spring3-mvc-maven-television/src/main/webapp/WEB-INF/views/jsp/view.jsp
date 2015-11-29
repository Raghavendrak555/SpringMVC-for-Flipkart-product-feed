<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Maven + Spring MVC</title>

<spring:url value="/resources/core/css/hello.css" var="coreCss" />

<link href="${coreCss}" rel="stylesheet" />

</head>



<h2>Television List</h2>
<div class="whole-list" style="width: 100%;">


	<c:forEach var="temp" items="${tv}">
		<div class="each"
			style="width: 30%; margin: 2px; border: 1px solid black; float: left;">
			<table style="width: 100%">
				<tr>
					<td><img src="${temp.imageUrl}" alt="TV View" width="180" height="200"></td>
				</tr>
				<tr>
					<td>Product Name: ${temp.title}</td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td>MRP: ${temp.MRP}</td>
				</tr>
				<tr>
					<td>Selling Price: ${temp.SP}</td>
				</tr>
				<tr>
					<td>Brand: ${temp.brand}</td>
				</tr>
				 <tr>
					<td>
					<a class="btn " href="${temp.url}">Buy Now</a>
					</td>
				</tr>
			</table>
		</div>
	</c:forEach>


</div>

<hr>


<spring:url value="/resources/core/css/hello.js" var="coreJs" />

<script src="${coreJs}"></script>

<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> -->

</body>
</html>