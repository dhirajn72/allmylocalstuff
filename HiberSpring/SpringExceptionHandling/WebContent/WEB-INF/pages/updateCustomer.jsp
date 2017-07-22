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
		<h1>Update Registration Form</h1>
		<form:form action="updateSubmit.do" commandName="customerCommand"
			method="post">
			<table>
				<tr>
					<td>Name</td>
					<td><form:input path="cname" onblur="showName(); " /></td>
					<td><font color="red"><form:errors path="cname" /></font></td>
					<td><div id="cname"></div>
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
					<td>Age</td>
					<td><form:input path="age" /></td>
					<td><font color="red"><form:errors path="age" /></font></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Register" /></td>
				</tr>
			</table>
		</form:form>
		<center>
			<a href="index.jsp"><button>Home</button></a>
		</center>


	</center>

</body>
</html>