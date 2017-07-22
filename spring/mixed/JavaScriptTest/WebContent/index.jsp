<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function show(bt) {

		alert(bt.value);
		var inp = document.test.uname;
		if (inp == 0) {
			/* var ref1 = document.test.getElementById("unerror");
			ref1.innerHTML = '<h1>Provide Username'; */
			document.write("username is mandatory")

			return false;
		}
		if (document.test.uname.value == "") {
			alert("Username should not be empty")
			document.test.uname.focus();
			return false;
		}
		if (document.test.password.value == "") {
			alert("Username should not be empty")
			document.test.uname.focus();
			return false;
		}
		var ref2 = document.getElementById("error");
		var msg = '';
		alert(ref2);

		if (bt.value == 'SAVE') {
			msg = '<font color=red size=5> Data Saved';
		} else if (bt.value == 'UPDATE') {
			msg = '<font color=red size=5> Data Updated';
		}

		ref2.innerHTML = msg;
	}
</script>
</head>
<body>

	<form name="test" action="test.do" onsubmit="return  show(this)">
		<div id="error"></div>
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="uname" /></td>
				<td><div id="unerror"></div></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
				<td><div id="pserror"></div></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					value="Login" /></td>
			</tr>
		</table>


	</form>


</body>
</html>