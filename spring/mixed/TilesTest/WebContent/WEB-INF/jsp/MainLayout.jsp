<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>
		<table height="1000%" width="100%">
			<tr bgcolor="red" height="50">
				<td colspan="2"><tiles:insert attribute="HEADER" /></td>
			</tr>
			<tr bgcolor="pink" height="100">
				<td bordercolor="green" width="50"><tiles:insert
						attribute="LMENU" /></td>
				<td bgcolor="yellow" width="100"><tiles:insert attribute="BODY" /></td>
			</tr>
			<tr bgcolor="red" height="20">
				<td colspan="2"><center>
						<tiles:insert attribute="FOOTER" />
					</center></td>
			</tr>
		</table>
	</center>
</body>
</html>