<%@page import="br.ucsal.entidades.Bibliografia"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style type="text/css">
td {
	padding: 80px !important;
}

.tdEspaco {
	display: table !important;
	float: left !important;
	margin-left: 192px !important;
	margin-bottom: 80px !important;
}

table {
	border-spacing: 50px 60px !important;
}

table>tbody>tr>td {
	padding: 5px 20px !important;
}
</style>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pesquisar</title>
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
				<li class="nav-item"><a class="nav-link" href="Home.jsp"">Home
				</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="Pesquisar.jsp">Pesquisar <span class="sr-only"></span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="Cadastro.jsp">Minhas
						reservas</a></li>
			</ul>
		</div>
	</h3>
	</nav>
	<!-- Fim do menu de navegação -->
	<form action="/GestaoBibliografica/PesquisarController" method="post">
		<br> <br> <br> <br>
		<div class="col-md-3 mb-3" align="center">
			<label for="validationDefault05"></label> <input type="text"
				class="form-control" name="pesquisa" placeholder="Pesquisar"
				required>
			<button type="submit" class="btn btn-success">Pesquisar</button>
		</div>
		<table>
			<tr>
				<%
					ArrayList<Bibliografia> x = Bibliografia.bibliografias;
					String pesquisa = (String) session.getAttribute("pesquisa");
					if (pesquisa != null) {
						for (int i = 0; i < Bibliografia.bibliografias.size(); i++) {
							if (x.get(i).getTitulo().toLowerCase().contains(pesquisa.toLowerCase())
									|| x.get(i).getAutor().getNome().toLowerCase().contains(pesquisa.toLowerCase())
									|| x.get(i).getAutor().getSobrenome().toLowerCase().contains(pesquisa.toLowerCase())
									|| x.get(i).getEditora().toLowerCase().contains(pesquisa.toLowerCase())
									|| x.get(i).getMateria().getNome().toLowerCase().contains(pesquisa.toLowerCase())) {
								out.print("<td class='tdEspaco'>Titulo:" + x.get(i).getTitulo() + " <br>Editora: "
										+ x.get(i).getEditora() + "<br> Autor: " + x.get(i).getAutor().getNome() + " "
										+ x.get(i).getAutor().getSobrenome() + "<br>Edição: " + x.get(i).getEdicao()
										+ "° Edição</td>");
							}
						}
					}
				%>
				<c:forEach var="livro" items="${bibliografias}">
					<c:if test="">
						<td class='tdEspaco'>Titulo: ${livro.titulo} <br>Editora:
							${livro.editora}<br> Autor: ${livro.autor.nome}
							${livro.autor.sobrenome}<br>Materia: ${livro.materia.nome}<br>
							Edição:${livro.edicao}° Edição
						</td>
					</c:if>
				</c:forEach>
			</tr>
		</table>
	</form>
</body>
</html>