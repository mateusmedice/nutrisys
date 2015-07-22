<%@ page pageEncoding="UTF-8"%>
<%@ include file="/templates/jstl.jsp" %>

<!DOCTYPE html>

<html>
	<head>
		<%@ include file="/templates/head.jsp" %>
		<link href="${ctx}/css/login.css" rel="stylesheet">
		
		<script type="text/javascript">
			$(function() {
				$("#formCadastro").validate({
					rules: {
						"serviceProvider.fullName": {
							required: true, minlength: 3
						},
						"serviceProvider.document": {
							required: true, minlength: 11
						},
						"serviceProvider.email": {
							required: true, email: true
						},
						"serviceProvider.password": {
							required: true, minlength: 6
						},
						"confirmacaoDeSenha": {
							required: true, equalTo: "#inputPassword"
						}
					}
				});
			});
		</script>
	</head>
	<body>
		<%@ include file="/templates/messages.jsp" %>
		
		<div class="login-form">
			<form id="formCadastro" action="${ctx}/saveServiceProvider" method="post">
				
				<h2>Dados</h2>
				
				<input type="text" placeholder="Name" name="serviceProvider.fullName" value="${serviceProvider.fullName}">
				
				<input type="text" placeholder="CPF" id="inputCPF" name="serviceProvider.document" value="${serviceProvider.document}">
				
				<input type="text" placeholder="Email" name="serviceProvider.email" value="${serviceProvider.email}">
				
				<input type="password" placeholder="Senha" name="serviceProvider.password" >
				
				<input type="password" placeholder="Confirme" name="confirmacaoDeSenha" id="inputPassword">
				
				<button class="btn btn-primary" type="submit">Create Account</button>
			
			</form>
			
		</div>
		
	</body>
	
	<script>
		jQuery(function($){
	       $("#inputCPF").mask("999.999.999-99");
		});
</script>
</html>