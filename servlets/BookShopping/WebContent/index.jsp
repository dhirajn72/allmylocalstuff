<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="searchbooks.jsp" method="post">
		<table>
			<tr>
				<td>Search Books</td>
			</tr>
			<tr>
				<td><select name="category">
						<option value="JAVA">JAVA</option>
						<option value=".Net">.Net</option>
						<option value="DataBase">DataBase</option>
						<option value="Testing">Testing</option>
						<option value="SAP">SAP</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Search" /></td>
			</tr>
		</table>
	</form>
</body>
</html>