<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<style>
.error-msg-color {
	color: red;
}
</style>
<head>
<title>Login Page</title>
</head>
<body>
	<h1>Login page !!</h1>
	<c:if test="${param.error != null}">
		<i class="error-msg-color">Invalid username/password</i>
		<hr />
	</c:if>
	<form:form action="${pageContext.request.contextPath}/process-login"
		method="POST">
		<label>Username: </label>
		<input type="text" name="username" placeholder="Enter username" />
		<br />
		<label>Password: </label>
		<input type="password" name="password" placeholder="Enter password" />
		<br />
		<input type="submit" value="Login" />
	</form:form>
</body>
</html>
