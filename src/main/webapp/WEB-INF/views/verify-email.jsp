<%@page import="com.empmanagement.services.Service"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aces</title>
<%@include file="bootstrap.jsp"%>
</head>
<body style="background: black;">
	<div class="container mt-5">

		<div class="row">

			<div class="col-md-4 offset-md-4">
			
				<div class="card mt-5">
					<div class="card-header text-center bg-primary">
						<h3>Verify Email</h3>
					</div>


					<div class="card-body bg-dark text-white">

						<form action="check-email" method="post">
							<div class="form-group">
								<label>Email address</label> 
								<input type="text" class="form-control" placeholder="Enter email" name="email">
							</div>
							<button type="submit" class="btn btn-primary">Verify Email</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>