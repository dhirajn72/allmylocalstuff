
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Add Customer Details</title>
</head>
<body>
	<form:form action="addCustomerSubmit.do" commandName="customerCommand"
		method="POST">
		<table>
			<%-- 			<tr>
				<td>Cid</td>
				<td><form:hidden path="cid" /></td>
			</tr> --%>
			<tr>
				<td>Cname</td>
				<td><form:input path="cname" /></td>
				<td><font color="red"><form:errors path="cname" /></font></td>
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
					value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
