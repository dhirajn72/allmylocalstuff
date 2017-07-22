<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="loginSubmit.do" commandName="addStudentCommand"
		method="post">
		<table>
			<tr>
				<td>Student Id:</td>
				<td><form:input path="sid" /></td>
				<td><font color="red"><form:errors path="sid" /></font></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><form:input path="sname" /></td>
				<td><font color="red"><form:errors path="sname" /></font></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
				<td><font color="red"><form:errors path="email" /></font></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><form:input path="phone" /></td>
				<td><font color="red"><form:errors path="phone" /></font></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>