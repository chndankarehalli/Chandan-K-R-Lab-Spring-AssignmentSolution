<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Save Student Information</title>
</head>
<body>

	<div class="container" align="center">
		<h3>Student Directory</h3>
		<hr>
		<p class="h4 mb-4">Student Employee</p>
		<form action="/StudentManagement/students/save"
			method="POST">
			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Student.id}" >

			<div class="form-inline">
				<input type="text" name="FName" value="${Student.name}"
					class="form-control mb-4 col-4" placeholder="Name">
			</div>
			<div class="form-inline">
				<input type="text" name="Department" value="${Student.department}"
					class="form-control mb-4 col-4" placeholder="Department">
			</div>
			<div class="form-inline">
				<input type="text" name="Country" value="${Student.country}"
					class="form-control mb-4 col-4" placeholder="Country">
			</div>
			<button type="submit" class="btn btn-info col-2">Save</button>
		</form>
		<hr>
		<a href="/StudentManagement/students/listStudents">Back to
			Students List</a>
	</div>

</body>
</html>