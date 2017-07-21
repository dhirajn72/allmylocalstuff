<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table>
			<tr>
				<td>Cid</td>
				<td>${TO.cid }</td>
			</tr>
			<tr>
				<td>Cname</td>
				<td>${TO.cname }</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${TO.email }</td>
			</tr>
			<tr>
				<td>Phone</td>
				<td>${TO.phone }</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>${TO.age }</td>
			</tr>
		</table>
		<h2>
			<a href="updateCustomer.do">Update</a>
		</h2>
	</center>
</body>
</html>