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
						<h3>Update Password</h3>
					</div>


					<div class="card-body bg-dark text-white">
					
						<form action="update-password" method="post">

							<div class="form-group">
								<label>Password</label> 
								<input type="password" class="form-control" placeholder="Password" name="password">
							</div>
							
							<div class="form-group">
								<label>Confirm Password</label> 
								<input type="password" class="form-control" placeholder="Password" name="confirm_password">
							</div>

							<div class="text-center pt-4">
								<button type="submit" class="btn btn-primary">Update</button>
							</div>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>