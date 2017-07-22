<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function f1() {
    var re=/^\w+$/;
		if (document.loginForm.username.value == "") {
			//document.loginForm.username.focus();
			alert("Enter username");
			var inDev=document.getElementById("username")
			inDev.innerHTML=""
			
		/* 	var dt=new Date();
			alert(dt.getDate()+" "+dt.getDay()); */
			return false;
		}else   
	    if(!re.test(document.loginForm.username.value)) {
		      alert("Error: Username must contain only letters, numbers and underscores!");
		      document.loginForm.username.focus();
		      return false;
		    }
		
		if (document.loginForm.password.value == "") {
			//document.loginForm.password.focus();
			alert("Enter password");
			return false;
		}
		/*  */
/* 		  
		  

		    if(form.pwd1.value != "" && form.pwd1.value == form.pwd2.value) {
		      if(form.pwd1.value.length < 6) {
		        alert("Error: Password must contain at least six characters!");
		        form.pwd1.focus();
		        return false;
		      }
		      if(form.pwd1.value == form.username.value) {
		        alert("Error: Password must be different from Username!");
		        form.pwd1.focus();
		        return false;
		      }
		      re = /[0-9]/;
		      if(!re.test(form.pwd1.value)) {
		        alert("Error: password must contain at least one number (0-9)!");
		        form.pwd1.focus();
		        return false;
		      }
		      re = /[a-z]/;
		      if(!re.test(form.pwd1.value)) {
		        alert("Error: password must contain at least one lowercase letter (a-z)!");
		        form.pwd1.focus();
		        return false;
		      }
		      re = /[A-Z]/;
		      if(!re.test(form.pwd1.value)) {
		        alert("Error: password must contain at least one uppercase letter (A-Z)!");
		        form.pwd1.focus();
		        return false;
		      }
		    } else {
		      alert("Error: Please check that you've entered and confirmed your password!");
		      form.pwd1.focus();
		      return false;
		    }

		    alert("You entered a valid password: " + form.pwd1.value);
		    return true;
		  } */
		
		
		
		

	}
</script>
</head>
<body>
	<center>
		<h1>Login Form</h1>
		<div id="status"></div>
		<form name="loginForm" onsubmit="return f1();">

			<table>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
					<td><div id="unMsg"></div></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
					<td><div id="pwMsg"></div></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit"
						value="Login" /></td>
				</tr>
			</table>


		</form>

	</center>
</body>
</html>