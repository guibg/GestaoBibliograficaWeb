package br.ucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.ucsal.entidades.Usuario;
import br.ucsal.util.Conexao;

public class UsuarioDAO {

	private Conexao conexao;

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
			e.printStackTrace();
		}
		return achou;
	}

	public void inserir(Usuario usuario) {
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("insert into USUARIO (LOGIN, SENHA) values (?,?);");
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean deletar(Usuario usuario) {
		return deletar(usuario.getId());
	}
	
	public boolean deletar(Integer idDeletar) {
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("DELETE usuario WHERE id = ?;");
			ps.setInt(1, idDeletar);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

}
