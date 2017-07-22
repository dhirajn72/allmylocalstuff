<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${EDIT eq 'TRUE' }">
		<table>
			<tr>
				<td>Customer id</td>
				<td>${TO.cid}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${TO.cname}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${TO.email}</td>
			</tr>
			<tr>
				<td>Phone</td>
				<td>${TO.phone}</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>${TO.age}</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><a href="updateCustomer.do">Update</a></td>
			</tr>
		</table>
	</c:if>

	<c:if test="${EDIT eq 'FALSE' }">
		<form:form action="updateSubmit.do" commandName="customerCommand"
			method="post">
			<table>
				<tr>
					<td>Id</td>
					<td>${TO.cid }<form:hidden path="cid" value="${TO.cid }" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:input path="cname" value="${TO.cname }" /></td>
					<td><form:errors path="cname" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="email" value="${TO.email }" /></td>
					<td><form:errors path="email" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><form:input path="phone" value="${TO.phone }" /></td>
					<td><form:errors path="phone" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><form:input path="age" value="${TO.age }" /></td>
					<td><form:errors path="age" /></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit"
						value="Update" /></td>
				</tr>
			</table>
		</form:form>
	</c:if>
</body>
</html>