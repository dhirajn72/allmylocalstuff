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
		<form action="searchBooks.do">
			<table>
				<tr>
					<td><select name="category">
							<option value="Select">Select</option>
							<option value="java">Java</option>
							<option value=".net">.Net</option>
							<option value="os">OS</option>
							<option value="php">Php</option>
							<option value="testing">Testing</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Search Books" /></td>
				</tr>
			</table>




		</form>
	</center>
</body>
</html>