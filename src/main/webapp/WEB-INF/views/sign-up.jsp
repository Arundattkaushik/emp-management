<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up</title>

<%@include file="bootstrap.jsp"%>
</head>
<body style="background:black; opacity: 0.85">

	<div class="container mt-5">

		<div class="row">

			<div class="col-md-8 offset-md-2">

				<div class="card">
					<div class="card-header text-center bg-primary">
						<h3>Sign up</h3>
					</div>


					<div class="card-body bg-dark text-white">



						<form action="create-user" method="post">

							<div class="form-row">
								<div class="col">
									<label>Name</label> 
									<input type="text" class="form-control"	placeholder="Name" name="name">
								</div>

								<div class="col">
									<label>Mobile</label> 
									<input type="text" class="form-control"	placeholder="Mobile" name="mobile">
								</div>
							</div>


							<!-- Employee Type -->
							<label  class="form-group mt-3">Type</label>
							<select name="empType" class="form-control" >
								<option selected>Choose...</option>
								<option>Employee</option>
								<option>Manager</option>
								<option>Admin</option>
							</select>
							
							
							<!-- Select Gender -->
							<label  class="form-group mt-3">Gender</label>
							<select name="gender" class="form-control">
								<option selected>Choose...</option>
								<option>Male</option>
								<option>Female</option>
							</select>
							

							
							<div class="form-group mt-3">
								<label>DOB</label> 
								<input name="dob" type="text" class="form-control" placeholder="DD/MM/YYYY">
							</div>

							<div class="form-group mt-3">
								<label>Email address</label> 
								<input type="text" class="form-control" placeholder="Enter email" name="email">
							</div>

							<div class="form-group">
								<label>Password</label> 
								<input type="password" class="form-control" placeholder="Password" name="password">
							</div>

							<div class="text-center pt-4">
								<button type="submit" class="btn btn-primary">Sign up</button>
							</div>
							
						<div class="card-body text-center">
							<a href="#" class="card-link">Forgot Password</a> 
							<a href="home"	class="card-link">Login</a>
						</div>
						</form>

					</div>


				</div>

			</div>

		</div>
	</div>

</body>
</html>