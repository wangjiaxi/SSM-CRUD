<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list</title>
</head>
<body>
	<div align="left">
	<table>
	<tr><td>id</td><td>name</td><td>age</td><td>delete?</td></tr>
	<c:forEach items="${userList}" var="user">
	<tr><td>${user.id}</td><td><a href="selectUserById?id=${user.id}&type=edit">${user.name}</a></td><td>${user.age}</td><td><a href="delUserById?id=${user.id}">delete</a></td></tr>
	</c:forEach>
		</table>
	</div>
</body>
</html>