<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form:form action="cidDeleteSubmit.do" commandName="cidCommand"
			method="post">
			<table>
				<tr>
					<td>Enter Cid</td>
					<td><form:input path="cid" /></td>
					<td><font color="red"><form:errors path="cid" />${exception}</font></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit"
						value="Submit" /></td>
				</tr>
			</table>


		</form:form>



	</center>

</body>
</html>