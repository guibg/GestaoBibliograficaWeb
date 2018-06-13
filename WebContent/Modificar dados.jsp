<%@page import="br.ucsal.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar dados</title>
</head>
<body>
	<!--  Menu de navegação> -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark"> <a
		href="https://www.ucsal.br/"> <img alt="Logo UCSal"
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
				<li class="nav-item"><a class="nav-link" href="Home.jsp">Home
				</a></li>
				<li class="nav-item"><a class="nav-link" href="Pesquisar.jsp">Pesquisar
						<span class="sr-only"></span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="ModificarDados.jsp">Modificar Dados <span class="sr-only"></span>
				</a></li>
			</ul>
		</div>
	</h3>
	</nav>
	<!-- Fim do menu de navegação -->
	<%
		Usuario usuario = new Usuario();
		usuario.setNome(usuario.getNome());
		usuario.setSobrenome(usuario.getSobrenome());
		usuario.setLogin(usuario.getLogin());
		usuario.setSenha(usuario.getSenha());
	%>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div align="center">
		<form action="/GestaoBibliografica/ModificarDadosController"
			method="post">

			<div class="form-row">
				<div class="col-md-2 mb-3">
					<label for="validationDefault01">Nome</label> <input type="text"
						class="form-control" name="nome"
						placeholder="<%usuario.getNome();%>" required>
				</div>
				<div class="col-md-2 mb-3">
					<label for="validationDefault02">Sobrenome</label> <input
						type="text" class="form-control" name="sobrenome"
						placeholder="<%usuario.getSobrenome();%>" required>
				</div>

				<div class="col-md-2 mb-3">
					<label for="validationDefaultUsername">Usuário</label> <input
						type="text" class="form-control" name="usuario"
						placeholder="<%usuario.getLogin();%>"
						aria-describedby="inputGroupPrepend2" required>
				</div>
			</div>
			<div class="form-row">
				<div class="col-md-2 mb-3">
					<label for="validationDefault03">Senha</label> <input type="text"
						class="form-control" name="senha" required>
				</div>
			</div>
			<button class="btn btn-primary" type="submit">Enviar dados</button>
		</form>
	</div>
</body>
</html>