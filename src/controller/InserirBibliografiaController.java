package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.dao.AutorDAO;
import br.ucsal.dao.BibliografiaDAO;
import br.ucsal.dao.MateriaDAO;
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
		String titulo = request.getParameter("titulo");
        String editora = request.getParameter("editora");
        String edicao = request.getParameter("edicao");
        String materia = request.getParameter("materiaId");
        String autor = request.getParameter("autorId");

        Bibliografia bibliografia = new Bibliografia();
        bibliografia.setTitulo(titulo);
        bibliografia.setEditora(editora);
        int edicaoInt = Integer.parseInt(edicao);
        bibliografia.setEdicao(edicaoInt);
        MateriaDAO MateriaDAO = new MateriaDAO();
        int materiaId = Integer.parseInt(materia);
        Materia materiaObj = MateriaDAO.getById(materiaId);
        bibliografia.setMateria(materiaObj);
        AutorDAO AutorDAO = new AutorDAO();
        int autorId = Integer.parseInt(autor);
        Autor autorObj = AutorDAO.getById(autorId);
        bibliografia.setAutor(autorObj);
        BibliografiaDAO bibliografiaDAO = new BibliografiaDAO();
        bibliografiaDAO.inserir(bibliografia);

        // FIX ME
        request.getRequestDispatcher("listarBibliografia.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getRequestDispatcher("Pesquisar.jsp").forward(request, response);
	}
}
