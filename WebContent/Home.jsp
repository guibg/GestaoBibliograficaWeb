<%@page import="br.ucsal.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina Principal</title>
</head>
<body>
	<!--  Menu de navegação> -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a href="https://www.ucsal.br/"> <img alt="Logo UCSal"
			src="https://ead.ucsal.br/pluginfile.php/1/theme_adaptable/logo/1523360667/logomarca_UCSal_branca_fundo_transparente_v2.png">
		</a>
		<h3>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarColor01" aria-controls="navbarColor01"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarColor01">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="Home.jsp">Home </a></li>
					<li class="nav-item"><a class="nav-link" href="Pesquisar.jsp">Pesquisar
							<span class="sr-only"></span>
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="ModificarDados.jsp">Modificar Dados <span
							class="sr-only"></span>
							<form action="/GestaoBibliografica/DeslogarController" method = "post">
							<li class="nav-item"><a class="nav-link">Sair <span
							class="sr-only"></span>
							</form>
					</a></li>
				</ul>
			</div>
		</h3>
	</nav>
	<!-- Fim do menu de navegação -->
	<!-- <c:import url="BarraNavegacaoLogado.jsp"></c:import> -->
</body>
</html>