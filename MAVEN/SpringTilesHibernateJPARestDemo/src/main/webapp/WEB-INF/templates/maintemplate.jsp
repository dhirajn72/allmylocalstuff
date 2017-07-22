<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height: 100%; width: 100%;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="height: 100%; width: 100%;">
	<table bgcolor="red" style="height: 100%; width: 100%;">
		<tr bgcolor="lightgreen">
			<td colspan="2" style="height: 10%; width: 100%;"><tiles:insertAttribute
					name="HEADER" /></td>
		</tr>
		<tr bgcolor="white" style="height: 80%; width: 100%;">
			<td width="20%"><tiles:insertAttribute name="LMENU" /></td>
			<td width="80%"><tiles:insertAttribute name="BODY" /></td>
		</tr>
		<tr bgcolor="lightgreen" style="height: 10%; width: 100%;">
			<td colspan="2"><tiles:insertAttribute name="FOOTER" /></td>
		</tr>
	</table>
</body>
</html>