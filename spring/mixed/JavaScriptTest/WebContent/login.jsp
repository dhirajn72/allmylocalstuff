<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function f1(bt) {
		var txNode = document.loginForm.username.focus();
	}
	function showUnMsg() {
		var unDiv = document.getElementById("unMsg");
		var msg = "Please Enter Username";
		msg = msg.fontcolor('green')
		msg = msg.fontsize(14);
/* 		unDiv.innerHTML = msg;
 */	}
	function showPsMsg() {
		var pwDiv = document.getElementById("pwMsg");
		var msg = "Please Enter Password";
		msg = msg.fontcolor('green')
		msg = msg.fontsize(14);
	/* 
				pwDiv.innerHTML = msg; */
	}

	function checkUsername() {
		var unDiv = document.getElementById("unMsg");
		unDiv.innerHTML = '';
		var un = document.loginForm.username.value;
		if (un == "" || un.length == 0) {
			var msg = "Username required";
			msg = msg.fontcolor('green')
			msg = msg.fontsize(14);
			unDiv.innerHTML = msg;
		}
	}

	function checkPassword() {
		var psDiv = document.getElementById("pwMsg");
		psDiv.innerHTML = '';
		var ps = document.loginForm.password.value;
		if (ps == "" || ps.length == 0) {
			var msg = "Password required";
			msg = msg.fontcolor('green')
			msg = msg.fontsize(14);
			psDiv.innerHTML = msg;
		}
	}

	function verifyUser() {
		var but = document.getElementById("but");
		but.disable = true;

		var un = document.loginForm.username.value;
		var ps = document.loginForm.password.value;

		if (un == ps) {
			msg = "Login Success !!";
		} else {
			msg = "Login Failed !!";
		}

		var stDiv = document.getElementById("status")
		stDiv.innerHTML = "<font color=red size=6>" + msg + "</font>"
		var unDiv = document.getElementById("unMsg");
		unDiv.innerHTML = "";
		var psDiv = document.getElementById("psMsg");
		psDiv.innerHTML = "";

	}
</script>
</head>
<body onload="f1();">
	<h1>Login Form</h1>
	<div id="status"></div>
	<form name="loginForm">

		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" onfocus="showUnMsg();"
					onblur="checkUsername();" /></td>
				<td><div id="unMsg"></div></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"
					onfocus="showPsMsg();" onblur="checkPassword();" /></td>
				<td><div id="pwMsg"></div></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input id="but" type="button"
					value="Login" onclick="verifyUser();" /></td>
			</tr>
		</table>


	</form>


</body>
</html>