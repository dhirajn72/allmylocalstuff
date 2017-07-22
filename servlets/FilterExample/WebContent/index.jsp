<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="testservlet.jsp" method="post" >
			<table  border="3">
				<tr bgcolor="red">
					<td>Name</td>
					<td><input type="text" name="name"></td>

				</tr>
				<tr bgcolor="red">
					<td>Email</td>
					<td><input type="text" name="email"></td>

				</tr>
				<tr bgcolor="red">
					<td>Phone</td>
					<td><input type="text" name="phone"></td>

				</tr>

				<tr >
					<td colspan="3" rowspan="2" align="center"><input
						type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>