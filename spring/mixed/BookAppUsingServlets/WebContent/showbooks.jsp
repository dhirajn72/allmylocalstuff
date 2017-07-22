<%@page import="java.util.ArrayList"%>
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

		<%
			Object object = request.getAttribute("MSG");
			if (object != null) {
		%>
		<br> <font color="red" size="6"><%=object%></font> <br>
		<center>
			<a href="index.jsp">Go to Search Page</a>
		</center>
		<center>
			<%
				} else {
					object = session.getAttribute("BOOKS");
					ArrayList<String> arrayList = (ArrayList<String>) object;
					for (String ob : arrayList) {
			%>

			<form action="addtocart.do" method="post">
				<table>
					<tr>
						<td><input type="hidden" name="bname" value="<%=ob%>" /></td>
						<td><font size="5"><%=ob%><input type="submit"
								value="Add to Cart" /></font></td>
					</tr>
				</table>
			</form>

			<%
				}
			%><br>
			<form action="showcart.do">
				<input type="submit" value="Show Cart" />
			</form>
			<%
				}
			%>

		</center>
	</center>
</body>
</html>