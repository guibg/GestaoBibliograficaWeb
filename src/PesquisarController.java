
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.entidades.Bibliografia;

@WebServlet("/PesquisarController")
public class PesquisarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PesquisarController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		request.getSession().setAttribute("pesquisa", pesquisa);
		request.getRequestDispatcher("Pesquisar.jsp").forward(request, response);
	}
}
