package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.dao.AutorDAO;
import br.ucsal.entidades.Autor;

/**
 * Servlet implementation class InserirAutorController
 */
@WebServlet("/InserirAutorController")
public class InserirAutorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirAutorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");

        Autor autor = new Autor();
        autor.setNome(nome);
        autor.setSobrenome(sobrenome);

        AutorDAO autorDAO = new AutorDAO();
        autorDAO.inserir(autor);

        // FIX ME
        request.getRequestDispatcher("AutorHome.jsp").forward(request, response);
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
