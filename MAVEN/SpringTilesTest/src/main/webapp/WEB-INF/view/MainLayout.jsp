<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table height="600" width="1300"  bgcolor="red">
		<tr height="100" bgcolor="green">
			<td colspan="2"><tiles:insertAttribute name="HEADER" /></td>
		</tr>
		<tr height="400" bgcolor="white">
			<td><tiles:insertAttribute name="LMENU" /></td>
			<td><tiles:insertAttribute name="BODY" /></td>
		</tr>
		<tr height="100" bgcolor="green">
			<td colspan="2"><tiles:insertAttribute name="FOOTER" /></td>
		</tr>
	</table>



</body>
</html>