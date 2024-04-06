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
						<h3>Login</h3>
					</div>


					<div class="card-body bg-dark text-white">



						<form>
							<div class="form-group">
								<label>Email address</label> <input type="text"
									class="form-control" placeholder="Enter email">
							</div>

							<div class="form-group">
								<label>Password</label> <input type="password"
									class="form-control" placeholder="Password">
							</div>

							<div class="text-center pt-4">
								<button type="submit" class="btn btn-primary">Login</button>
							</div>
						</form>


						<div class="card-body text-center">
							<a href="#" class="card-link">Forgot Password</a> 
							<a href="sign-up"
								class="card-link">Sign Up</a>
						</div>

					</div>


				</div>

			</div>

		</div>
	</div>
</body>
</html>