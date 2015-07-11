<%@ page pageEncoding="UTF-8"%>
<%@ include file="/templates/jstl.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<!-- Meus imports -->
	</head>
	<body>
		<div class="page-header">
			<h1>Dashboard <small>do </small></h1>
		</div>
		
		<div class="tabbable tabs-left">
			<ul class="nav nav-tabs">
				<li class="active"><a href="#tab1" data-toggle="tab">Minhas Issues</a></li>
				<li><a href="#tab2" data-toggle="tab">Todas</a></li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="tab1">
					<table class="table table-striped ">
						<tbody>
							
						</tbody>
					</table>
				</div>
				<div class="tab-pane" id="tab2">
					<table class="table table-striped ">
						<tbody>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
		
	</body>
</html>