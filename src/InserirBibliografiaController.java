
import java.io.IOException;

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

		Bibliografia bibliografia = new Bibliografia();
		Autor autor = new Autor();
		autor.setNome((String) request.getAttribute("autorNome"));
		autor.setSobrenome((String) request.getAttribute("autorSobreome"));
		Materia materia = new Materia();
		materia.setNome((String) request.getAttribute("materia"));
		bibliografia.setTitulo((String) request.getAttribute("titulo"));
		bibliografia.setAutor(autor);
		bibliografia.setMateria(materia);
		bibliografia.setEdicao((Integer) request.getAttribute("edicao"));
		Bibliografia.inserirBibliografia(bibliografia);
	}

}
