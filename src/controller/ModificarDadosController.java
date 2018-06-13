package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.dao.UsuarioDAO;
import br.ucsal.entidades.Usuario;

/**
 * Servlet implementation class ModificarDados
 */
@WebServlet("/ModificarDadosController")
public class ModificarDadosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ModificarDadosController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		
		//request.getRequestDispatcher("").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String usuario = request.getParameter("usuario");
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String senha = request.getParameter("senha");
		int idInt = Integer.parseInt(id); 
		UsuarioDAO dao = new UsuarioDAO();
		Usuario conta = new Usuario();
		Usuario contaVerificar = dao.obterUsuarioPeloId(idInt);
		System.out.println(contaVerificar.getSenha());
		if(senha.equals(contaVerificar.getSenha())){
		conta.setId(idInt);
		conta.setLogin(usuario);
		conta.setNome(nome);
		conta.setSobrenome(sobrenome);
		conta.setSenha(senha);
		dao.atualizar(conta);
		request.getSession().setAttribute("conta", conta);
		request.getRequestDispatcher("/Home.jsp").forward(request, response);
		}
	}

}
