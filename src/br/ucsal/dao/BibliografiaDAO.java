package br.ucsal.dao;

import br.ucsal.entidades.Autor;
import br.ucsal.entidades.Bibliografia;
import br.ucsal.util.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BibliografiaDAO {

	private Conexao conexao;

	public List<Bibliografia> Consultar() {
		List<Bibliografia> Bibliografias = new ArrayList<>();

		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("SELECT AUTORES.Titulo, AUTORES.SOBRETitulo, "
							+ "BibliografiaS.ID, TituloBibliografia, ID_AUTOR, EDITORA, EDICAO FROM BibliografiaS, AUTORES WHERE BibliografiaS.ID_AUTOR = AUTORES.ID);");
			ResultSet rs = ps.executeQuery();
			boolean achou = false;
			while (rs.next() && !achou) {
				Bibliografia Bibliografia = new Bibliografia();
				Bibliografia.setId(rs.getInt("ID"));
				Bibliografia.setTitulo(rs.getString("TituloBibliografiaS"));
				Bibliografia.setEditora(rs.getString("EDITORA"));
				Bibliografia.setEdicao(rs.getInt("EDICAO"));

				Autor autor = new Autor();
				autor.setId(rs.getInt("ID_AUTOR"));
				autor.setNome(rs.getString("Nome"));
				autor.setSobrenome(rs.getString("Sobrenome"));

				Bibliografia.setAutor(autor);

				if (rs.getInt("ID_AUTOR") == Bibliografia.getId()
						&& rs.getString("TituloBibliografia").equals(Bibliografia.getTitulo())) {
					achou = true;
					Bibliografias.add(Bibliografia);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Bibliografias;
	}

	public List<Bibliografia> listar() {
		Statement stmt;
		List<Bibliografia> Bibliografias = new ArrayList<>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select BibliografiaS.ID, Titulo, ID_AUTOR, EDICAO, EDITORA;");
			while (rs.next()) {
				Bibliografia l = new Bibliografia();
				l.setId(rs.getInt("id"));
				l.setTitulo(rs.getString("Titulo"));
				l.setEdicao(rs.getInt("edicao"));
				l.setEditora(rs.getString("editora"));

				Autor autor = new Autor();
				autor.setId(rs.getInt("autor_id"));
				autor.setNome(rs.getString("Nome"));
				autor.setSobrenome(rs.getString("Sobrenome"));

				l.setAutor(autor);

				Bibliografias.add(l);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Bibliografias;
	}

	public void inserir(Bibliografia Bibliografia) {
		try {

			PreparedStatement ps = conexao.getConnection().prepareStatement(
					"insert into BibliografiaS (Titulo, ID_AUTOR, EDICAO, EDITORA) values (?,?,?,?);");
			ps.setString(1, Bibliografia.getTitulo());
			ps.setInt(2, Bibliografia.getAutor().getId());
			ps.setInt(3, Bibliografia.getEdicao());
			ps.setString(4, Bibliografia.getEditora());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
