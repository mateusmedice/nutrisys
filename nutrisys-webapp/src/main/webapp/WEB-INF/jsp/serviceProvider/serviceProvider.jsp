<%@ page pageEncoding="UTF-8"%>
<%@ include file="/templates/jstl.jsp" %>

<!DOCTYPE html>

<html>
	<head>
		
	</head>
	<body>
		<%@ include file="/templates/messages.jsp" %>
		
		<div class="login-form">
			<form action="${ctx}/save" method="post">
				
				<h2>Dados</h2>
				
				<input type="text" placeholder="Name" name="serviceProvider.fullName">
				
				<input type="text" placeholder="CPF" name="serviceProvider.document">
				
				<input type="text" placeholder="Email" name="serviceProvider.email">
				
				<input type="password" placeholder="Senha" name="serviceProvider.password">
				
				<button class="btn btn-primary" type="submit">Create Account</button>
			
			</form>
			
		</div>
		
	</body>
</html>