<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
		<h1>This is mobile site</h1>

		<table align="center" bgcolor="red">
			<form:form action="searchBySID.do" commandName="sidSearchCommand"
				method="POST">

				<tr bgcolor="green">
					<td>Enter SID:</td>
					<td><form:input path="sid" /></td>
				</tr>
				<tr>
					<td colspan="2" bgcolor="white"><font color="red"><form:errors
								path="sid" />${exception}</font></td>
				</tr>
				<tr bgcolor="green">
					<td colspan="2" align="center"><input type="submit"
						value="Search" /></td>
				</tr>

			</form:form>
		</table>
	</center>
</body>
</html>

