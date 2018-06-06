package br.ucsal.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadTables {

	public void creatScherma(Connection c) throws SQLException {

		// Usuarios
		Statement stmt = c.createStatement();
		stmt.execute("create table usuario(nome varchar(20), sobrenome varchar(50),"
				+ "login varchar(12), senha varchar(12),id int PRIMARY KEY, id_avaliacao int);");

		// Autores
		stmt.execute("create table autor(nome varchar(20), sobrenome varchar(50),id int PRIMARY KEY);");

		// Tabela autor e bibliografia
		stmt.execute("create table autor_bibliografia (id int PRIMARY KEY, id_autor int, id_bibliografia int);");


		// Bibliografias
		stmt.execute("create table bibliografia(titulo varchar(50),edicao int,editora varchar(50),"
				+ " id int PRIMARY KEY, id_materia int);");

		// Materia
		stmt.execute("create table materia(nome varchar(30),id int PRIMARY KEY);");

		// Foreign Keys
		stmt.execute(
				"alter table autor_bibliografia add constraint fk_id_autor foreign key (id_autor) references autor(id);");
		stmt.execute("alter table autor_bibliografia add constraint fk_id_bibliografia foreign key (id_bibliografia)"
				+ " references bibliografia(id);");
		stmt.execute(
				"alter table usuario add constraint fk_id_avaliacao foreign key (id_avaliacao) references avaliacao(id);");
		stmt.execute(
				"alter table avaliacao add constraint fk_id_usuario foreign key (id_usuario) references usuario(id);");
		stmt.execute(
				"alter table avaliacao add constraint fk_id_bibliografia foreign key (id_bibliografia) references bibliografia(id);");
		stmt.execute(
				"alter table bibliografia add constraint fk_id_materia foreign key (id_materia) references materia(id);");

	}

}
