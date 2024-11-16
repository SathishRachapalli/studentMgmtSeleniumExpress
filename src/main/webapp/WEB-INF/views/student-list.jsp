<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Info</title>

<!--

<style type="text/css">
h1 {
	color: blue;
}
</style>

  -->

<link rel="stylesheet" type="text/css"
	href="/springJdbc_Preview/URLtoHandleResourcesFolder/style-sheet.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>

<body class="myFonts">

		<h1 align="center">SATHISH EXPRESS</h1>
		
	<div class="container" >
	
	<!--  ADD BUTTON -->
		<form action="addStudent">

			<input type="submit" value="ADD STUDENT"
				class="btn btn-outline-success">

		</form>

		<br />

		<table border="1" class="table table-hover">
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
				</tr>
			</thead>

			<c:forEach var="student" items="${students}">

				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td><a
						href="/springJdbc_Preview/updateStudent?userId=${student.id}">Update<a></a></td>
					<td><a
						href="/springJdbc_Preview/deleteStudent?userId=${student.id}"
						onclick="
			
			if(!(confirm('Are you sure to delete this student?')))
				return false">Delete<a></a></td>

				</tr>

			</c:forEach>

		</table>

		<br /> <br />


	</div>

</body>
</html>