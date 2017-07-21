<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="javascript" type="text/javascript">
	function f1() {
		var name = document.regForm.cname.focus();
	}

	function showName() {
		var un = document.getElementById("cname");
		un.innerHTML = '';
		var unLength = document.regForm.cname.value;
		if (unLength == "" || unLength.length == 0) {
			msg = "Enter name";
			msg = msg.fontcolor("green");
			un.innerHTML = msg;
		}
	}
</script>
</head>
<body onload="f1();">
	<center>
		<h1>Registration Form</h1>
		<form:form name="regForm" action="registerSubmit.do"
			commandName="customerCommand" method="post" onsubmit="showName()">
			<table>
				<%-- <tr>
					<td>Cid</td>
					<td><form:input path="cid" /></td>
					<td><form:errors path="cid" /></td>
				</tr> --%>
				<tr>
					<td>Name</td>
					<td><form:input path="cname" id="cname" /></td>
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