<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String bname = request.getParameter("branch");
		if (bname.equals("MKR")) {
	%>
	<jsp:forward page="mkr.jsp">
		<jsp:param name="bn" value="MKR" />
		<jsp:param name="email" value="mkr@jlc.com" />

	</jsp:forward>
	<%
		} else if (bname.equals("BTM")) {
	%>
	<jsp:forward page="btm.jsp">
		<jsp:param name="bn" value="BTM" />
		<jsp:param name="email" value="btm@jlc.com" />

	</jsp:forward>
	<%
		}
	%>
	<c:out value="${Singh}"></c:out>

</body>
</html>