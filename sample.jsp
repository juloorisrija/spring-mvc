<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login page</h1>
<form action="home" method="post">
userName:<input type="text" name="userName"/><br><br>
password:<input type="password" name="password"/>
<input type="submit" value="submit" />
</form>
<div style="color:red">${error}</div>
</body>
</html>