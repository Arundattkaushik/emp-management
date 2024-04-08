<%@page import="com.empmanagement.entities.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
Employee employee = (Employee) session.getAttribute("emp");
%>
<meta charset="UTF-8">
<title>Edit: Details</title>

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



						<form action="update-details?emp_id=<%=employee.getId() %>" method="post">

							<div class="form-row">
								<div class="col">
									<label>Name</label> 
									<input type="text" class="form-control"	placeholder="Name" name="name" value="<%=employee.getName() %>">
								</div>

								<div class="col">
									<label>Mobile</label> 
									<input type="text" class="form-control"	placeholder="Mobile" name="mobile" value="<%=employee.getMobile() %>">
								</div>
							</div>


							<!-- Employee Type -->
							<label  class="form-group mt-3">Type</label>
							<select name="empType" class="form-control" >
							<%
							if(employee.getEmpType().equalsIgnoreCase("admin")){
							%>
							<option selected >Choose...</option>
								<option>Employee</option>
								<option>Manager</option>
								<option>Admin</option>
							<%
							}
							else{
							%>
								<option selected="selected"><%=employee.getEmpType() %></option>
							<%
							}
							%>
								
							</select>
							
							
							<!-- Select Gender -->
							<label  class="form-group mt-3">Gender</label>
							<select name="gender" class="form-control">
								<option selected><%=employee.getGender()%></option>
								<option>Male</option>
								<option>Female</option>
							</select>
							

							
							<div class="form-group mt-3">
								<label>DOB</label> 
								<input name="dob" type="text" class="form-control" placeholder="DD/MM/YYYY" value="<%=employee.getDob()%>">
							</div>

							<div class="form-group mt-3">
								<label>Email address</label> 
								<input type="text" class="form-control" disabled="disabled" name="email" value="<%=employee.getEmail()%>">
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