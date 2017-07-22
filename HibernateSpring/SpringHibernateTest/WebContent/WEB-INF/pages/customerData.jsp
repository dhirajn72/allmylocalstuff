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
		<font color="red" size="6"> ENTER YOUR RECORD </font>

		<form:form name="customerForm" action="customerDataSubmit.do"
			commandName="customer" method="post">
			<table bgcolor="red">
				<%-- 			<tr>
				<td>Cid</td>
				<td><form:input path="cid" /></td>
				<td><form:errors path="cid" /></td>

			</tr>
			 --%>
				<tr bgcolor="yellow">
					<td>Cname</td>
					<td><form:input path="cname" /></td>
					<td><font color="red"><form:errors path="cname" /></font></td>

				</tr>
				<tr bgcolor="yellow">
					<td>Email</td>
					<td><form:input path="email" /></td>
					<td><font color="red"><form:errors path="email" /></font></td>

				</tr>
				<tr bgcolor="yellow">
					<td>Phone</td>
					<td><form:input path="phone" /></td>
					<td><font color="red"><form:errors path="phone" /></font></td>

				</tr>
				<tr bgcolor="yellow">
					<td>Age</td>
					<td><form:input path="age" /></td>
					<td><font color="red"><form:errors path="age" /></font></td>

				</tr>
				<tr bgcolor="yellow">
					<td>Company</td>
					<td><form:input path="company" /></td>
					<td><font color="red"><form:errors path="company" /></font></td>

				</tr>
				<tr bgcolor="yellow">
					<td>City</td>
					<td><form:input path="city" /></td>
					<td><font color="red"><form:errors path="city" /></font></td>

				</tr>
				<tr bgcolor="yellow">

					<td colspan="2" align="right"><input type="submit"
						value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>