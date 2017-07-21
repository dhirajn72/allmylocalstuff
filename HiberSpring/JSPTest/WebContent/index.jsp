<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function f1() {
		var txNode = document.regForm.name.focus();
	}
	function f2() {
		var txNode = document.regForm.email.focus();
	}
	function f3() {
		var txNode = document.regForm.phone.focus();
	}
	function showUn() {
		var unDiv = document.getElementById("un");
		var msg = "Enter Name";
		msg = msg.fontcolor('green');
		unDiv.innerHTML = msg;
	}
	function showEm() {
		var unDiv = document.getElementById("em");
		var msg = "Enter Email";
		msg = msg.fontcolor('green');
		unDiv.innerHTML = msg;
	}
	function showPh() {
		var unDiv = document.getElementById("ph");
		var msg = "Enter Phone";
		msg = msg.fontcolor('green');
		unDiv.innerHTML = msg;
	}
	function checkName() {
		var unDiv = document.getElementById("un");
		unDiv.innerHTML = '';
		var un = document.regForm.name.value;
		if (un == "" || un.length == 0) {
			emsg = "Name is mandatory";
			emsg = emsg.fontcolor("red");
			unDiv.innerHTML = emsg;
		}

	}

	function checkEmail() {
		var emDiv = document.getElementById("em");
		emDiv.innerHTML = '';
		var em = document.regForm.email.value;
		if (em == "" || em.length == 0) {
			emsg = "Email is mandatory";
			emsg = emsg.fontcolor("red");
			emDiv.innerHTML = emsg;
		}

	}
	function checkPhone() {
		var phDiv = document.getElementById("ph");
		phDiv.innerHTML = '';
		var ph = document.regForm.phone.value;
		if (ph == "" || ph.length == 0) {
			emsg = "Phone is mandatory";
			emsg = emsg.fontcolor("red");
			phDiv.innerHTML = emsg;
		}
	}
</script>

<title>Insert title here</title>
</head>
<body onload="f1();">
	<center>
		<h2>Registration Form</h2>
		<form name="regForm" action="formSubmit.do" method="post">
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" onfocus="showUn();"
						onblur="checkName();" /></td>
					<td><div id="un"></div></td>
					<!-- onblur="checkName();"  -->
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" onfocus="showEm();"
						onblur="checkEmail();" /></td>
					<!--  onblur="checkEmail();"  -->
					<td><div id="em"></div></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" onfocus="showPh();"
						onblur="checkPhone();" /></td>
					<!--  onblur="checkPhone();"  -->
					<td><div id="ph"></div></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit"
						value="Submit" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>