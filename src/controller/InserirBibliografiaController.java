package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.entidades.Autor;
import br.ucsal.entidades.Bibliografia;
import br.ucsal.entidades.Materia;

/**
 * Servlet implementation class InserirBibliografiaController
 */
@WebServlet("/InserirBibliografiaController")
public class InserirBibliografiaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InserirBibliografiaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getRequestDispatcher("Pesquisar.jsp").forward(request, response);
	}
}
