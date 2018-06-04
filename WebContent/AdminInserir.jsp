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
<title>Inserir livros</title>
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
				<li class="nav-item"><a class="nav-link" href="AdminHome.jsp"">Home
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="AdminPesquisar.jsp">Pesquisar <span class="sr-only"></span>
				</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="AdminInserir.jsp">Inserir</a></li>
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
	<div align="center">
		<form action="/GestaoBibliografica/EfetuarCadastroController"
			method="post">
			<div class="form-row">
				<div class="col-md-2 mb-3">
					<label for="validationDefault01">Título</label> <input type="text"
						class="form-control" placeholder="Título" required name="titulo">
				</div>
				<div class="col-md-2 mb-3">
					<label for="validationDefault02">Editora</label> <input type="text"
						class="form-control" placeholder="Editora" required>
				</div>

				<div class="col-md-2 mb-3">
					<label for="validationDefaultUsername">Autor Nome</label> <input
						type="text" class="form-control" id="validationDefaultUsername"
						placeholder="Autor" aria-describedby="inputGroupPrepend2" required
						name="autorNome">
				</div>

				<div class="col-md-2 mb-3">
					<label for="validationDefaultUsername">Autor Sobrenome</label> <input
						type="text" class="form-control" id="validationDefaultUsername"
						placeholder="Autor" aria-describedby="inputGroupPrepend2" required
						name="autorSobrenome">
				</div>
				<div class="col-md-2 mb-3">
					<label for="validationDefaultUsername">Materia</label> <input
						type="text" class="form-control" id="validationDefaultUsername"
						placeholder="Materia" aria-describedby="inputGroupPrepend2"
						required name="materia">
				</div>
			</div>
			<div class="form-row">
				<div class="col-md-2 mb-3">
					<label for="validationDefault04">Edição</label> <input type="text"
						class="form-control" id="validationDefault04" placeholder="Edição"
						required name="edicao">
				</div>
			</div>
			<button class="btn btn-primary" type="submit">Cadastrar
				livro</button>
		</form>
	</div>
</body>
</html>