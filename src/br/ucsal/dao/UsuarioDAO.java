package br.ucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.ucsal.entidades.Usuario;
import br.ucsal.util.Conexao;

public class UsuarioDAO {

	private Conexao conexao = new Conexao();

	public boolean verificar(Usuario usuario) {
		boolean achou = false;
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("SELECT LOGIN, SENHA FROM USUARIOS WHERE LOGIN = ? AND SENHA = ?);");
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ResultSet rs = ps.executeQuery();

			while (rs.next() && !achou) {
				if (rs.getString("LOGIN").equals(usuario.getLogin())
						&& rs.getString("SENHA").equals(usuario.getSenha())) {
					achou = true;
				}
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println(usuario);
			
			e.printStackTrace();
		}
		return achou;
	}

	public void inserir(Usuario usuario) {
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("insert into usuarios (login, senha, nome, sobrenome) values (?, ?, ?, ?)");
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ps.setString(3, usuario.getNome());
			ps.setString(4, usuario.getSobrenome());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Usuario usuario) {
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("update USUARIOS set LOGIN = ?, SENHA = ?, NOME = ?, SOBRENOME + ?;");
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ps.setString(3, usuario.getNome());
			ps.setString(4, usuario.getSobrenome());
			ps.setInt(5, usuario.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
