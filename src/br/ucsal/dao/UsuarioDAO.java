package br.ucsal.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
            PreparedStatement ps = conexao.getConnection().prepareStatement("SELECT ID_USUARIO, LOGIN, SENHA FROM USUARIOS WHERE LOGIN = ? AND SENHA = ?);");
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ResultSet rs = ps.executeQuery();

            while (rs.next() && !achou) {
                if (rs.getString("LOGIN").equals(usuario.getLogin()) && rs.getString("SENHA").equals(usuario.getSenha())) {
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
                    .prepareStatement("insert into USUARIOS (LOGIN, SENHA) values (?,?);");
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
