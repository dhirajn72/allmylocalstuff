<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="ST" class="com.java.test.Student" scope="session" />
	<jsp:setProperty name="ST" property="sid" value="99" />
	<jsp:setProperty name="ST" property="sname" value="Dhiraj" />
	<jsp:setProperty name="ST" property="email" value="dhiraj@google.com" />
	<jsp:setProperty name="ST" property="phone" value="9934369400" />
	<jsp:setProperty name="ST" property="age" value="24" />



</body>
</html>