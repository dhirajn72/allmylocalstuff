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
	<center>
		<form:form action="updateCustomerSubmit.do "
			commandName="customerCommand" method="post">
			<table>
				<tr>
					<td>Cid</td>
					<td>${TO.cid }<form:hidden path="cid" value="${TO.cid}" /></td>
				</tr>
				<tr>
					<td>Cname</td>
					<td><form:input path="cname" value="${TO.cname}" /></td>
					<td><form:errors path="cname" value="${TO.cname}" /></td>

				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="email" value="${TO.email}" /></td>
					<td><form:errors path="email" value="${TO.email}" /></td>

				</tr>
				<tr>
					<td>Phone</td>
					<td><form:input path="phone" value="${TO.phone}" /></td>
					<td><form:errors path="phone" value="${TO.phone}" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><form:input path="age" value="${TO.age}" /></td>
					<td><form:errors path="age" value="${TO.age}" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Update" /></td>
				</tr>
			</table>
		</form:form>


	</center>

</body>
</html>