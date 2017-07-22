<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="true"%>
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
				<td>Sid</td>
				<td><jsp:getProperty property="sid" name="ST" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><jsp:getProperty property="sname" name="ST" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><jsp:getProperty property="email" name="ST" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><jsp:getProperty property="phone" name="ST" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><jsp:getProperty property="age" name="ST" /></td>
			</tr>
		</table>
	</center>

</body>
</html>