<%@ page pageEncoding="UTF-8"%>
<%@ include file="/templates/jstl.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/templates/head.jsp" %>
		<link href="${ctx}/css/login.css" rel="stylesheet">
	</head>
	<body>
		
		<%@ include file="/templates/messages.jsp" %>
		
		<div class="login-form">
			<form action="${ctx}/login" method="post">
				<h2>Login</h2>
				<input type="text" placeholder="DDDD" name="login">
				<input type="password" placeholder="dddd" name="senha">
				<button class="btn btn-primary" type="submit">ddd</button>
				<a href="${ctx}/createNew">ddd</a>
			</form>
		</div>
		
	</body>
</html>