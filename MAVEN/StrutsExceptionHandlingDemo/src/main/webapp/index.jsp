<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		${exception}
		<html:form action="/sidSubmit.do">
			<table>
				<tr>
					<td>Enter Sid</td>
					<td><html:text property="sid"></html:text></td>
					<td><font color="red"><html:errors /> </font></td>

				</tr>
				<tr>
					<td colspan="2" align="right"><html:submit value="Search"></html:submit></td>
				</tr>
			</table>
		</html:form>
	</center>
</body>
</html>