<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="stu" class="com.jlcindia.usebean.Student"
		scope="session" />
	<jsp:setProperty property="sid" name="stu" value="88" />
	<jsp:setProperty property="sname" name="stu" value="Singh" />
	<jsp:setProperty property="email" name="stu" value="singh@gmail.com" />
	<jsp:setProperty property="phone" name="stu" value="8888888" />
	<br>
	<center>
		<font color="red">
			<table>

				<tr>
					<td>Sid:</td>
					<td><jsp:getProperty property="sid" name="stu" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><jsp:getProperty property="sname" name="stu" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><jsp:getProperty property="email" name="stu" /></td>
				</tr>
				<tr>
					<td>Phone:</td>
					<td><jsp:getProperty property="phone" name="stu" /></td>
				</tr>

			</table>
		</font>
	</center>
</body>
</html>