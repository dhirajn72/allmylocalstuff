<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table bgcolor="red" border="2">
			<tr>
				<td bgcolor="white">Sid:</td>
				<td bgcolor="white">${TO.cid }</td>
			</tr>
			<tr>
				<td bgcolor="white">Cname:</td>
				<td bgcolor="white">${TO.cname }</td>
			</tr>
			<tr>
				<td bgcolor="white">Email:</td>
				<td bgcolor="white">${TO.email }</td>
			</tr>
			<tr>
				<td bgcolor="white">Phone:</td>
				<td bgcolor="white">${TO.phone }</td>
			</tr>
		</table>
	</center>
</body>
</html>