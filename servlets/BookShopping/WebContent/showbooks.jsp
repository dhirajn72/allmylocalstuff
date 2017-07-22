<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Object object = request.getAttribute("MSG");
		if (object != null) {
	%>
	<font color="red"> <%=object%></font>
	<br>
	<a href="index.jsp">Go to Search page </a>
	<%
		} else {
			object = session.getAttribute("BOOKS");
			ArrayList<String> blist = (ArrayList<String>) object;
			for (String books : blist) {
	%>
	<form action="addtocart.jsp" method="post">
		<input type="hidden" name="bname" /> <font color="red"><%=books%>
			<input type="submit" value="ADD TO CART"> </font>
	</form>
	<%
		}
	%><br>
	<form action="showcart.jsp">
		<input type="submit" value="SHOW CART" />
	</form>
	<%
		}
	%>

</body>
</html>