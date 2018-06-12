package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.dao.UsuarioDAO;
import br.ucsal.entidades.Usuario;

@WebServlet("/EfetuarCadastroController")
public class EfetuarCadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EfetuarCadastroController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String senha = request.getParameter("senha");
		String confirmarSenha = request.getParameter("confirmarSenha");

		Usuario conta = new Usuario();
		UsuarioDAO dao = new UsuarioDAO();

		if (senha.equals(confirmarSenha)) {
			conta.setLogin(usuario);
			conta.setNome(nome);
			conta.setSobrenome(sobrenome);
			conta.setSenha(senha);
			dao.inserir(conta);
			request.getRequestDispatcher("/GestaoBilbiografica/Login.jsp").forward(request, response);
		} else {
			response.sendRedirect("/GestaoBibliografica/Cadastro.jsp");
		}
	}

}
