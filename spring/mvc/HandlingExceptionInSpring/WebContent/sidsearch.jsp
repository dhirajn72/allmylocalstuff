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
		<form:form action="searchStudent.do" commandName="sidSearchCommand"
			method="POST">
			<table>
				<tr>
					<td>Enter SID:</td>
					<td><form:input path="sid" /></td>
					<td><font color="red"><form:errors path="sid" />${exception}</font></td>
				</tr>
				<tr>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>