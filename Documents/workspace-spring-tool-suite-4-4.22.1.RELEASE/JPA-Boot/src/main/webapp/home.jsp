<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Text-field</title>
</head>
<body>

		<form action="addBug">
		<h1>Enter ID, Name, Company Name: </h1>
			
			<h4>ID</h4>
			<input type="text" name="aid"><br>
			<h4>Name</h4>
			<input type="text" name="aname"><br>
			<h4>Tech</h4>
			<input type="text" name="tech"><br>
			<input type="submit"><br> <br> <br>
		</form>
		
		<h1>Search data with ID:</h1>
		<form action="getBug">
			<h4>Enter ID No. Search</h4>
			<input type="text" name="aid"><br>
			<input type="submit"><br>
		</form>

</body>
</html>