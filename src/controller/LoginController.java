package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.dao.UsuarioDAO;
import br.ucsal.entidades.Usuario;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");

		UsuarioDAO dao = new UsuarioDAO();
		Usuario conta = new Usuario();
		conta.setLogin(usuario);
		conta.setSenha(senha);
		if (usuario.equals("admin") && senha.equals("admin")) {
			response.sendRedirect("/GestaoBibliografica/AdminHome.jsp");
		} else if (dao.verificar(conta)) {
			response.sendRedirect("/GestaoBibliografica/Home.jsp");
		} else {
			response.sendRedirect("/GestaoBibliografica/Login.jsp");
		}
	}

}
