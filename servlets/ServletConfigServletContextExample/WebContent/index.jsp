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
		<table bgcolor="black">
			<tr>
				<td>
					<form action="hello.jsp" method="post">
						<table bgcolor="red">
							<tr>
								<td>First Name:</td>
								<td><input type="text" name="fname"></td>
							</tr>
							<tr>
								<td>Last Name:</td>
								<td><input type="text" name="lname"></td>
							</tr>
							<tr>
								<td colspan="2" align="right"><input type="submit"
									value="SUBMIT"></td>
							</tr>
						</table>
					</form> <br>
				</td>
			</tr>
			<br>
			<tr>
				<td>
					<form action="hai.jsp" method="post">
						<table bgcolor="blue">
							<tr>
								<td>First Name:</td>
								<td><input type="text" name="fname"></td>
							</tr>
							<tr>
								<td>Last Name:</td>
								<td><input type="text" name="lname"></td>
							</tr>
							<tr>
								<td colspan="2" align="right"><input type="submit"
									value="SUBMIT"></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>