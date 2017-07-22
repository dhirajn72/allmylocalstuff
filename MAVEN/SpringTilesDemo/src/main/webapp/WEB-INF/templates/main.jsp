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
	<center>
		<table width="100%">
			<tr height="100">
				<td bgcolor="red" colspan="2"><tiles:insertAttribute
						name="HEADER" /></td>
			</tr>
			<tr height="600">
				<td width="300" bgcolor="green" colspan="1"><tiles:insertAttribute
						name="LMENU" /></td>
				<td width="1060" bgcolor="green" colspan="1"><tiles:insertAttribute
						name="BODY" /></td>
			</tr>
			<tr height="100">
				<td bgcolor="red" colspan="2"><tiles:insertAttribute
						name="FOOTER" /></td>
			</tr>
		</table>
	</center>
</body>
</html>