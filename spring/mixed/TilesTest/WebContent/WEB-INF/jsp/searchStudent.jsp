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
	<form:form action="searchSubmit.do" commandName="searchCommand"
		method="post">
		<table>
			<tr>
				<td>Enter Sid</td>
				<td><form:input path="sid" /></td>
				<td><form:errors path="sid" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Search" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>