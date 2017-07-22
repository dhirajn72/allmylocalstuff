<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<script>
	function validateForm()

	{

		document.bgcolor = "red";
		if (document.val.id.value == "") {
			alert("Id should not be blank..");
			document.val.id.focus();
			return false;
		} else if (document.val.name.value == "") {
			alert("Name should not be blank");
			document.val.name.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<center>
		<form:form name="val" action="loginSubmit.do"
			commandName="contactCommand" method="post"
			onsubmit="return validateForm()">
			<table bgcolor="red">
				<tr bgcolor="yellow">
					<td>ID</td>
					<td><form:input path="id" /></td>
					<td><font color="red"><form:errors path="id" /></font></td>
				</tr>
				<tr bgcolor="yellow">
					<td>Name</td>
					<td><form:input path="name" /></td>
					<td><font color="red"><form:errors path="name" /></font></td>
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
					<td>DOB</td>
					<td><form:input path="dob" /></td>
					<td><font color="red"><form:errors path="dob" /></font></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit"
						value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>