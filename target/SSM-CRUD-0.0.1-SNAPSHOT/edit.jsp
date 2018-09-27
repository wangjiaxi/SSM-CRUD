<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>edit</title>
</head>
<body>
	<div align="left">
	<form action="updUserById" method="POST" enctype="application/x-www-form-urlencoded">
	<input type="hidden" name="id" value="${user.id}"><br>
	name:<input type="text" name="name" value="${user.name}"><br>
	age:<input type="text" name="age" value="${user.age}"><br>
	<input type="submit"  value="edit">
	</form>
	</div>
</body>
</html>