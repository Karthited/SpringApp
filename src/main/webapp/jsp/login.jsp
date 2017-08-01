<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Yahoo!!</title>
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
	<div class="container">
	<div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">SpringApp</h3>
                </div>
                <div class="panel-body">
				<form class="form-horizontal" action='login' method="POST">
					<fieldset>
						<div class="control-group">
							<!-- Username -->
							<label class="control-label" for="username">Username</label>
							<div class="controls">
								<input type="text" id="username" name="name"
									placeholder="Username" class="input-xlarge">
							</div>
						</div>
						<div class="control-group">
							<!-- Password-->
							<label class="control-label" for="password">Password</label>
							<div class="controls">
								<input type="password" id="password" name="password"
									placeholder="Password" class="input-xlarge">
							</div>
						</div>
						<br>
						<div class="control-group">
							<!-- Button -->
							<div class="controls">
								<button class="btn btn-primary" name="Submit" type="Submit">Login</button>
							</div>
						</div>
					</fieldset>
				</form>
			</div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
</html>