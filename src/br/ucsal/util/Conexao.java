package br.ucsal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private Connection connection = null;

	private String url = "jdbc:postgresql://localhost:6543/GestaoBibliografica";
	private String usuario = "postgres";
	private String senha = "postgresql";

	private static Conexao conexao;

	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Conexao() {
		try {
			connection = DriverManager.getConnection(url, usuario, senha);
			// new LoadTables().creatScherma(connection);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o banco: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public static Conexao getConexao() {
		if (conexao == null) {
			conexao = new Conexao();
		}
		return conexao;
	}

	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
