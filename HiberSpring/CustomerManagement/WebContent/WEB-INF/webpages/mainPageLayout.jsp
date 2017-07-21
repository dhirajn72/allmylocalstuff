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
	<table bgcolor="red" width="1300" height="600">
		<tr height="10">
			<td bgcolor="green" colspan="2"><tiles:insertAttribute
					name="HEADER" /></td>
		</tr>
		<tr height="500">
			<td width="100"  bgcolor="yellow"><tiles:insertAttribute
					name="LMENU" /></td>
			<td width="400" bgcolor="yellow"><tiles:insertAttribute
					name="BODY" />
		</tr>
		<tr height="10">
			<td bgcolor="green" colspan="2"><tiles:insertAttribute
					name="FOOTER" />
		</tr>
	</table>
</body>
</html>