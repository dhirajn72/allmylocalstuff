<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
	<h2>Hello World!</h2>
	<form:form action="http://localhost:8080/SpringRESTWS/rest/"
		commandName="cust" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					value="Submit" /></td>
			</tr>


		</table>

	</form:form>
</body>
</html>
