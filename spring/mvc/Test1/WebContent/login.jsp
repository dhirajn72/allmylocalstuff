<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
		<form:form action="loginSubmit.do" commandName="loginCommand"
			method="POST">
			<table>
				<tr>
					<td>Username</td>
					<td><form:input path="username" /></td>
					<td><font color="red"><form:errors path="username" /></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path="password" /></td>
					<td><font color="red"><form:errors path="password" /></font></td>
				</tr>
				<tr>
					<td colspan="2" align="left"><input type="submit"
						value="Login" /></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>