package br.ucsal.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadTables {

	public void creatScherma(Connection c) throws SQLException {

		// Usuarios
		Statement stmt = c.createStatement();
		stmt.execute("create table usuarios(nome varchar(20), sobrenome varchar(50),"
				+ "login varchar(12), senha varchar(12),id SERIAL PRIMARY KEY, tipo varchar(7));");

		// Avalição
		stmt.execute(
				"create table avaliacao(id SERIAL PRIMARY KEY, nota int, comentario VARCHAR (150),id_usuario int, id_bibliografia int );");

		// Autores
		stmt.execute("create table autores(nome varchar(20), sobrenome varchar(50),id SERIAL PRIMARY KEY);");

		// Tabela autor e bibliografia
		stmt.execute("create table autor_bibliografia (id SERIAL PRIMARY KEY, id_autor int, id_bibliografia int);");

		// Tabela materia e Bibliografia
		stmt.execute("create table materia_bibliografia (id SERIAL PRIMARY KEY, id_materia int, id_bibliografia int )");

		// Bibliografias
		stmt.execute("create table bibliografias(titulo varchar(50),edicao int,editora varchar(50),"
				+ " id SERIAL PRIMARY KEY, id_materia int);");

		// Materia
		stmt.execute("create table materias(nome varchar(30),id SERIAL PRIMARY KEY);");

		// Foreign Keys
		stmt.execute(
				"alter table autor_bibliografia add constraint fk_id_autor foreign key (id_autor) references autores(id);");
		stmt.execute("alter table autor_bibliografia add constraint fk_id_bibliografia foreign key (id_bibliografia)"
				+ " references bibliografias(id);");
		stmt.execute(
				"alter table avaliacao add constraint fk_id_usuario foreign key (id_usuario) references usuarios(id);");
		stmt.execute(
				"alter table avaliacao add constraint fk_id_bibliografia foreign key (id_bibliografia) references bibliografias(id);");
		stmt.execute(
				"alter table bibliografia add constraint fk_id_materia foreign key (id_materia) references materias(id);");
		stmt.execute(
				"alter table materia_bibliografia add constraint fk_id_materia foreign key (id_materia) references materias(id);");
		stmt.execute(
				"alter table materia_bibliografia add constraint fk_id_bibliografia foreign key (id_bibliografia) references bibliografias(id);");

	}
}
