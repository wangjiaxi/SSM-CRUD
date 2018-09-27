<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert</title>
</head>
<body>
	<div align="left">
	<form action="insertUserParams" method="POST" enctype="application/x-www-form-urlencoded">
	id:<input type="text" name="id"><br>
	name:<input type="text" name="name"><br>
	age:<input type="text" name="age"><br>
	<input type="submit"  value="insert">
	</form>
	</div>
</body>
</html>