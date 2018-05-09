package br.ucsal.dao;

import java.sql.Connection;

public class Conexao {

 private Connection connection = null;
	
 private String url = "jdbc:postgresql://localhost/NOME DO BANCO";
 private String usuario = "SA";
 private String senha = "";
 
	private static Conexao conexao;

	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
