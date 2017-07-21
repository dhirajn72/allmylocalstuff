<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<c:if test="${EDIT eq 'TRUE' }">
			<table>
				<tr>
					<td>Cid</td>
					<td>${CTO.cid }</td>
				</tr>
				<tr>
					<td>Name</td>
					<td>${CTO.cname }</td>
				</tr>
				<tr>
					<td>Email</td>
					<td>${CTO.email }</td>
				</tr>
				<tr>
					<td>Phone</td>
					<td>${CTO.phone }</td>
				</tr>
				<tr>
					<td>Age</td>
					<td>${CTO.age }</td>
				</tr>
			</table>
			<a href="editContact.do"><button>Edit</button></a>

		</c:if>
		<c:if test="${EDIT eq 'FALSE' }">

			<h1>Update Registration Form</h1>
			<form:form action="updateSubmit.do" commandName="customerCommand"
				method="post">
				<table>
					<tr>
						<td>Cid</td>
						<td>${CTO.cid}<form:hidden path="cid" value="${CTO.cid}"
								onblur="showName(); " /></td>
						<td><font color="red"><form:errors path="cid" /></font></td>
						<td><div id="cid"></div>
					</tr>
					<tr>
						<td>Name</td>
						<td><form:input path="cname" value="${CTO.cname}"
								onblur="showName(); " /></td>
						<td><font color="red"><form:errors path="cname" /></font></td>
						<td><div id="cname"></div>
					</tr>
					<tr>
						<td>Email</td>
						<td><form:input path="email" value="${CTO.email}" /></td>
						<td><font color="red"><form:errors path="email" /></font></td>
					</tr>
					<tr>
						<td>Phone</td>
						<td><form:input path="phone" value="${CTO.phone}" /></td>
						<td><font color="red"><form:errors path="phone" /></font></td>
					</tr>
					<tr>
						<td>Age</td>
						<td><form:input path="age" value="${CTO.age}" /></td>
						<td><font color="red"><form:errors path="age" /></font></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Update" /></td>
					</tr>
				</table>
			</form:form>
			<center>
				<a href="index.jsp"><button>Home</button></a>
			</center>
		</c:if>

	</center>

</body>
</html>