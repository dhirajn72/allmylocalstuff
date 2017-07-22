<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table bgcolor="red" bordercolor="black">
			<tr>
				<td>Sid</td>
				<td>Sname</td>
				<td>Email</td>
				<td>Phone</td>
			</tr>
			<tr>
				<c:forEach var="item" items="${AL }">
					<td><font color="blue">${item }</font></td>
				</c:forEach>
			</tr>
		</table>

	</center>



</body>
</html>