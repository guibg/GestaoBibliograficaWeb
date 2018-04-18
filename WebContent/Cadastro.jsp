<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
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
					<li class="nav-item"><a class="nav-link"
						href="/GestaoBibliografica/login.jsp">Login </a></li>
					<li class="nav-item active"><a class="nav-link"
						href="/GestaoBibliografica/Cadastro.jsp">Cadastrar</a></li>
				</ul>
			</div>
		</h3>
	</nav>
	<!-- Fim do menu de navegação -->
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
		<form action="/GestaoBibliografica/EfetuarCadastroController"
			method="post">

			<div class="form-row">
				<div class="col-md-2 mb-3">
					<label for="validationDefault01">Primeiro nome</label> <input
						type="text" class="form-control" placeholder="Primeiro nome"
						required>
				</div>
				<div class="col-md-2 mb-3">
					<label for="validationDefault02">Sobrenome</label> <input
						type="text" class="form-control" placeholder="Sobrenome" required>
				</div>

				<div class="col-md-2 mb-3">
					<label for="validationDefaultUsername">Usuário</label> <input
						type="text" class="form-control" id="validationDefaultUsername"
						placeholder="Usuario" aria-describedby="inputGroupPrepend2"
						required>
				</div>
			</div>
			<div class="form-row">
				<div class="col-md-2 mb-3">
					<label for="validationDefault03">Senha</label> <input type="text"
						class="form-control" id="validationDefault03" placeholder="City"
						required>
				</div>
				<div class="col-md-2 mb-3">
					<label for="validationDefault04">Confirmar senha</label> <input
						type="text" class="form-control" id="validationDefault04"
						placeholder="Senha" required>
				</div>
			</div>
			<button class="btn btn-primary" type="submit">Efetuar
				Cadastro</button>
		</form>
	</div>
</body>
</html>