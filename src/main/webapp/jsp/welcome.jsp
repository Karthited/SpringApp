<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner col-xs-offset-3 col-xs-6">
			<div class="item active">
				<blockquote>
					<div class="carousel-content">
						<div>
							<p>We all have ability. The difference is how we use it.</p>
						</div>
					</div>
				</blockquote>
			</div>

			<div class="item">
				<blockquote>
					<div class="carousel-content">
						<div>
							<p>However difficult life may seem, there is always something
								you can do and succeed at.</p>
						</div>
					</div>
				</blockquote>
			</div>

			<div class="item">
				<blockquote>
					<div class="carousel-content">
						<div>
							<p>However difficult life may seem, there is always something
								you can do and succeed at.</p>
						</div>
					</div>
				</blockquote>
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
	<h2>Welcome ${name}!!!!!</h2>
	<form class="form-inline" action="addUser" method="post">
		<div class="form-group">
			<label for="firstName">FirstName:</label> <input type="text"
				class="form-control" id="firstName" name="firstname">
		</div>
		<div class="form-group">
			<label for="email">Email address:</label> <input type="email"
				class="form-control" id="email" name="email">
		</div>
		<div class="form-group">
			<label for="phone">Phone Number:</label> <input type="number"
				class="form-control" id="phone" name="phone">
		</div>
		<div class="form-group">
			<label for="dateOfBirth">Date Of Birth:</label> <input type="text"
				class="form-control" id="dateOfBirth" name="dateOfBirth"
				placeholder="dd/MM/yyyy">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	<br>
	<span><c:if test="${not empty message}">
			<c:out value="${message}" />
		</c:if></span>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Firstname</th>
				<th>Email</th>
				<th>Phone</th>
				<th>DateOfBirth</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="phone" items="${phoneBooks}">
				<tr>
					<td>${phone.firstname}</td>
					<td>${phone.email}</td>
					<td>${phone.phone}</td>
					<td>${phone.dateOfBirth}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>