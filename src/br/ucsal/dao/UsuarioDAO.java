package br.ucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ucsal.entidades.Autor;
import br.ucsal.entidades.Bibliografia;
import br.ucsal.entidades.Usuario;
import br.ucsal.util.Conexao;

public class UsuarioDAO {

	private Conexao conexao;

	public UsuarioDAO() {
		this.conexao = conexao.getConexao();
	}

	public boolean verificar(Usuario usuario) {
		boolean achou = false;
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("SELECT LOGIN, SENHA FROM USUARIOS WHERE LOGIN = ? AND SENHA = ?");
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
					.prepareStatement("insert into USUARIOS (LOGIN, SENHA, NOME, SOBRENOME, TIPO) values (?,?,?,?,?);");
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ps.setString(3, usuario.getNome());
			ps.setString(4, usuario.getSobrenome());
			ps.setString(5, "usuario");
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Usuario usuario) {
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("update USUARIOS set LOGIN = ?, SENHA = ?, NOME = ?, SOBRENOME = ? WHERE id = ?");
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

	public Usuario obterUsuarioPorLoginSenha(String usuario, String senha) {

		Usuario conta = null;
		try {
			PreparedStatement ps = conexao.getConnection().prepareStatement(
					"SELECT ID, NOME, SOBRENOME, LOGIN, SENHA FROM USUARIOS WHERE LOGIN = ? AND SENHA = ?");
			ps.setString(1, usuario);
			ps.setString(2, senha);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				conta = new Usuario();
				conta.setId(rs.getInt("id"));
				conta.setLogin(rs.getString("login"));
				conta.setSenha(rs.getString("senha"));
				conta.setNome(rs.getString("nome"));
				conta.setSobrenome(rs.getString("sobrenome"));

			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conta;
	}

	public Usuario obterUsuarioPeloId(int id) {

		Usuario conta = null;
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("SELECT ID, NOME, SOBRENOME, LOGIN, SENHA FROM USUARIOS WHERE ID = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				conta = new Usuario();
				conta.setId(rs.getInt("id"));
				conta.setLogin(rs.getString("login"));
				conta.setSenha(rs.getString("senha"));
				conta.setNome(rs.getString("nome"));
				conta.setSobrenome(rs.getString("sobrenome"));
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conta;
	}

}
