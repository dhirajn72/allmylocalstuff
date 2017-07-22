<%@page import="com.jlcindia.usebean.Student"%>
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
		Student stu = new Student();
		stu.setSid(99);
		stu.setSname("Singh");
		stu.setPhone("9999999");
		stu.setEmail("dhiraj@gmail.com");
		session.setAttribute("STU", stu);
	%>
	<hr>
	<%
		Student stu1 = (Student) session.getAttribute("STU");
	%><center>
		<font color="red">
			<table>
				<tr>
					<td>Sid:<%=stu1.getSid()%></td>
				</tr>
				<tr>
					<td>Name:<%=stu1.getSname()%></td>
				</tr>
				<tr>
					<td>Email:<%=stu1.getEmail()%></td>
				</tr>
				<tr>
					<td>Phone:<%=stu1.getPhone()%></td>
				</tr>
			</table>
		</font>
	</center>
</body>
</html>