<%@ page pageEncoding="UTF-8"%>
<%@ include file="/templates/jstl.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript">
			
		</script>
	</head>
	<body>
	
		<legend>Clientes</legend>
	
		<div class="pull-right">
			<a href="novo" class="btn">Novo</a>
			<a href="voltar" class="btn" >Voltar</a>
		</div>
	
		<br/><br/>
		<table class="table table-striped ">
			<thead>
				<tr>
					<th>#</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Peso</th>
					<th>Tamanho</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="client" items="${clientList}">
					<tr>
						<td>${client.idUser}</td>
						<td>${client.fullname}</td>
						<td>${client.email}</td>
						<td>${client.weight}</td>
						<td>${client.size}</td>
						<td class="nowrap">
							<a href="edita?idUser=${client.idUser}"><i class="icon-pencil"></i>Editar</a> &nbsp;
   							<a class="link-exclusao" href="remove?idUser=${client.idUser}"><i class="icon-trash"></i>Excluir</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>