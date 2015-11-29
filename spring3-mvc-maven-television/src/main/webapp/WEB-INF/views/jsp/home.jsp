<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>FlipKart Televisions Details</title>
 
<spring:url value="/resources/core/css/hello.css" var="coreCss" />

<link href="${coreCss}" rel="stylesheet" />
</head>
<body>


	<h2>Welcome to flipkart TV details</h2>
	<p>
		<a class="btn " href="viewAll">View Televisions</a>
	</p>

	<hr>

	<spring:url value="/resources/core/css/hello.js" var="coreJs" />
	<script src="${coreJs}"></script>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>