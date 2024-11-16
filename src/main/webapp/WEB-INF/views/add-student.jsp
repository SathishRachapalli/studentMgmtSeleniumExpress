
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>


<link rel="stylesheet" type="text/css"
	href="/springJdbc_Preview/URLtoHandleResourcesFolder/add-student.css">
<link rel="stylesheet" type="text/css"
	href="/springJdbc_Preview/URLtoHandleResourcesFolder/style-sheet.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">


</head>

<div align="center">
	<h1>Add Student</h1>
	<!--  creating html form to fill up the new student details -->

	<form:form action="save-student" modelAttribute="student" method="POST">

		<form:hidden path="id" />

		<label>Name : </label>
		<form:input path="name" />
		<br />

		<label>Mobile : </label>
		<form:input path="mobile" />
		<br />

		<label>Country : </label>
		<form:input path="country" />
		<br />

		<input type="submit" value="Submit" class="myButton">

	</form:form>




</div>


</body>
</html>