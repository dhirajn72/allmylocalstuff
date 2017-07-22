<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<center>
	<%@include file="header.html"%></center>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<jsp:include page="header.jsp">
			<jsp:param name="header" value="JAVA LEARNING CENTER" />
		</jsp:include>
		<form action="test.jsp">
			<h3>Select the Branch</h3>
			<select name="branch">
				<option value="MKR">MKR</option>
				<option value="BTM">BTM</option>
			</select> <input type="submit" value="Submit" />
		</form>
		<jsp:include page="footer.jsp">
			<jsp:param name="footer" value="Java Learning Center" />
		</jsp:include>
	</center>
</body>
</html>