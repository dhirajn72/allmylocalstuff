<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles"
	prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="2000" height="950" bgcolor="red">

		<tr height="10%" bgcolor="yellow">
			<td colspan="2" align="center"><tiles:insert attribute="HEADER" /></td>
		</tr>
		<tr height="80%">
			<td width="220" bgcolor="red" align="center"><tiles:insert
					attribute="LMENU" /></td>

			<td bgcolor="green" align="left"><tiles:insert attribute="BODY" /></td>
		</tr>
		<tr height="10%" bgcolor="yellow">
			<td colspan="2" align="center"><tiles:insert attribute="FOOTER" /></td>
		</tr>
	</table>
</body>
</html>