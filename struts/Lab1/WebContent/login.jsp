<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<html:form action="/jlcindia.jlc">
			<html:text property="username" />
			<html:errors property="username" />

			<html:password property="password" />
			<html:errors property="password" />
			<html:submit value="Submit" />
		</html:form>
	</center>
</body>
</html>