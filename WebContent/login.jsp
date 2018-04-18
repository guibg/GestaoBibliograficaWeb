<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">

<title>Login</title>

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
					<li class="nav-item active"><a class="nav-link" href="#">Login
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="Cadastro.jsp">Cadastrar</a></li>
				</ul>
			</div>
		</h3>
	</nav>
	<!-- Fim do menu de navegação -->
	<form action="/GestaoBibliografica/LoginController" method="post">
		<div align="center">
			<br> <br> <br> <br> <br> <br> <br>
			<h1>Acessar</h1>
			<div class="col-md-3 mb-3">
				<label for="validationDefault05"></label> <input type="text"
					class="form-control" name="usuario" placeholder="Login" required>
			</div>
			<div class="col-md-3 mb-3">
				<label for="validationDefault05"></label> <input type="password"
					class="form-control" placeholder="Senha" required>
			</div>
			<button type="submit" class="btn btn-success">Entrar</button>
	</form>
	<form action="/CadastroController" method="post">
		<a href="/GestaoBibliografica/Cadastro.jsp"> Não é cadastrado
			ainda? </a>
	</form>
	</div>
</body>
</html>