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
		<form action="dataSubmit.do">
			<table>
				<tr>
					<td>Sid</td>
					<td><input type="text" name="sid" /></td>
					<td><font color="red">${SID}</font></td>

				</tr>
				<tr>
					<td>Sname</td>
					<td><input type="text" name="sname" /></td>
					<td><font color="red">${SNAME }</font></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
					<td><font color="red">${EMAIL }</font></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" /></td>
					<td><font color="red">${PHONE }</font></td>
				</tr>
				<tr>
					<td colspan="4" align="right"><input type="submit"
						value="Submit" /></td>
				</tr>
			</table>
		</form>
	</center>

</body>
</html>