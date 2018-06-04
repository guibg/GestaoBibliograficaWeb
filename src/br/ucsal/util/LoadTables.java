package br.ucsal.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadTables {


    public void creatScherma(Connection c) throws SQLException {

// Usuarios
        Statement stmt = c.createStatement();
        stmt.execute("CREATE TABLE USUARIOS ( ID INTEGER IDENTITY PRIMARY KEY,  LOGIN VARCHAR(30),"
                + " SENHA  VARCHAR(30));");


        // Autores
        stmt.execute("CREATE TABLE AUTORES ( ID INTEGER IDENTITY PRIMARY KEY,  NOME VARCHAR(30),"
                + " SOBRENOME  VARCHAR(30));");


        // PRECISA DE UMA TABELA COM ID AUTOR E ID LIVRO ?  stmt.execute("ALTER TABLE ESPACOS ADD FOREIGN KEY (BLOCO_ID) REFERENCES BLOCOS(ID);");
        //  stmt.execute("CREATE TABLE TIPOS ( ID INTEGER IDENTITY PRIMARY KEY, NOME VARCHAR(255), DESCRICAO  VARCHAR(255));");
        //  stmt.execute("ALTER TABLE ESPACOS ADD FOREIGN KEY (TIPO_ID) REFERENCES TIPOS(ID);");


        // Livros
        stmt.execute("CREATE TABLE LIVROS ( ID INTEGER IDENTITY PRIMARY KEY, NOMELIVRO VARCHAR(255), ID_AUTOR INTEGER , "
                + "EDICAO INTEGER , EDITORA VARCHAR(255)");
        stmt.execute("ALTER TABLE LIVROS ADD FOREIGN KEY (ID_AUTOR) REFERENCES AUTORES(ID);");


    }

}
