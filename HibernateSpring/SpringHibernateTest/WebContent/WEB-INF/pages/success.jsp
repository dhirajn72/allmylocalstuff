<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update page</title>
</head>
<body>
	<center>

		<c:if test="${EDIT eq 'FALSE' }">

			<h2>Your Submitted Data</h2>
			<table bgcolor="red">
				<tr bgcolor="yellow">
					<td>Name</td>
					<td>${CTO.cname }</td>
				</tr>
				<tr bgcolor="yellow">
					<td>Email</td>
					<td>${CTO.email }</td>
				</tr>
				<tr bgcolor="yellow">
					<td>Phone</td>
					<td>${CTO.phone }</td>
				</tr>
				<tr bgcolor="yellow">
					<td>Age</td>
					<td>${CTO.age }</td>
				</tr>
				<tr bgcolor="yellow">
					<td>Company</td>
					<td>${CTO.company }</td>
				</tr>
				<tr bgcolor="yellow">
					<td>City</td>
					<td>${CTO.city }</td>
				</tr>
				<tr bgcolor="yellow">
					<td colspan="2" align="center"><a
						href='<c:url value="update.do"></c:url>'><button>Update</button></a></td>

				</tr>
			</table>
		</c:if>
		<c:if test="${EDIT eq 'TRUE' }">
			<h2>Update Your Data</h2>
			<form:form action="customerUpdate.do" commandName="customer"
				method="post">
				<table bgcolor="red">
					<%-- <tr bgcolor="yellow">
						<td>Id</td>
						<td><form:input path="cid" value="${ID}" readonly="readonly" /></td>
					</tr> --%>
					<tr bgcolor="yellow">
						<td>Name</td>
						<td><form:input path="cname" value="${CTO.cname }" /></td>
						<td><font color="red"><form:errors path="cname"></form:errors></font></td>
					</tr>
					<tr bgcolor="yellow">
						<td>Email</td>
						<td><form:input path="email" value="${CTO.email }" /></td>
						<td><font color="red"><form:errors path="email"></form:errors></font></td>
					</tr>
					<tr bgcolor="yellow">
						<td>Phone</td>
						<td><form:input path="phone" value="${CTO.phone }" /></td>
						<td><font color="red"><form:errors path="phone"></form:errors></font></td>
					</tr>
					<tr bgcolor="yellow">
						<td>Age</td>
						<td><form:input path="age" value="${CTO.age }" /></td>
						<td><font color="red"><form:errors path="age"></form:errors></font></td>
					</tr>
					<tr bgcolor="yellow">
						<td>Company</td>
						<td><form:input path="company" value="${CTO.company }" /></td>
						<td><font color="red"><form:errors path="company"></form:errors></font></td>
					</tr>
					<tr bgcolor="yellow">
						<td>City</td>
						<td><form:input path="city" value="${CTO.city }" /></td>
						<td><font color="red"><form:errors path="city"></form:errors></font></td>
					</tr>
					<tr bgcolor="yellow">
						<td colspan="2" align="center"><font color="red"><input
								type="submit" value="Update" /></font></td>
					</tr>
				</table>
			</form:form>
		</c:if>
	</center>
</body>
</html>