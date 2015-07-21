<%@ page pageEncoding="UTF-8"%>
<%@ include file="/templates/jstl.jsp" %>

<!DOCTYPE html>

<html>
	<head>
		<!-- Meus imports -->
	</head>
	<body>
		<div class="page-header">
			<h1>Bem Vindo <small>${user.name}</small></h1>
		</div>
		
		<div class="tabbable tabs-left">
			<ul class="nav nav-tabs">
				<li class="active"><a href="#tabClient" data-toggle="tab">Clientes</a></li>
				<li><a href="#tabRevenue" data-toggle="tab">Receitas</a></li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="tabClient">
					<table class="table table-striped ">
						<tbody>
							<c:forEach var="client" items="${clientList}">
								<tr>
									<td>
										${client.idClient}
									</td>
									<td>
										${client.fullName}
									</td>
									<td>
										${client.email}
									</td>
									<td>
										
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="tab-pane" id="tabRevenue">
					<table class="table table-striped ">
						<tbody>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>