package br.ucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import br.ucsal.entidades.Materia;
import br.ucsal.util.Conexao;

public class MateriaDAO {
	
	private Conexao conexao;
	
	public void inserir(Materia materia) {
        try {

           
			PreparedStatement ps = conexao.getConnection().prepareStatement(
                    "insert into materias (nome) values (?);");
            ps.setString(1, materia.getNome());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean deletar(Materia materia) {
        return deletar(materia.getId());
    }

    public boolean deletar(Integer idDeletar) {
        try {
            PreparedStatement ps = conexao.getConnection().prepareStatement("DELETE materias WHERE id = ?;");
            ps.setInt(1, idDeletar);
            ps.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public Materia getById(int id){
        Materia materia = null;
        try {
            PreparedStatement ps = conexao.getConnection().prepareStatement("select id, nome from materias where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setId(rs.getInt("id"));
                materia.setNome(rs.getString("nome"));
            }
        }catch (SQLException e ){
            e.printStackTrace();
        }
    return materia;
    }
}
