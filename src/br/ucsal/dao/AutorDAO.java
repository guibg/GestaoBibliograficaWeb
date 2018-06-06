package br.ucsal.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.ucsal.entidades.Autor;
import br.ucsal.util.Conexao;

public class AutorDAO {

	private Conexao conexao;
	
	public boolean deletar(Autor autor) {
		return deletar(autor.getId());
	}

	public boolean deletar(Integer idDeletar) {
		try {
			PreparedStatement ps = conexao.getConnection().prepareStatement("DELETE Autor WHERE id = ?;");
			ps.setInt(1, idDeletar);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
	
	public void inserir(Autor autor) {
		try {

			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("insert into Autor (Nome,sobrenome) values (?,?);");
			ps.setString(1, autor.getNome());
			ps.setString(2, autor.getSobrenome());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
