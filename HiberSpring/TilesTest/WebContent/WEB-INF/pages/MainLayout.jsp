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
	<table height="100%" width="100%" bgcolor="red">
		<tr height="10%" bgcolor="green">
			<td colspan="2"><tiles:insertAttribute name="HEADER" /></td>
		</tr>
		<tr height="80%" bgcolor="yellow">
			<td width="20%"><tiles:insertAttribute name="LMENU" /></td>
			<td width="80%"><tiles:insertAttribute name="BODY" /></td>
		</tr>
		<tr height="10%" bgcolor="green">
			<td colspan="2"><tiles:insertAttribute name="FOOTER" /></td>
		</tr>
	</table>
</body>
</html>