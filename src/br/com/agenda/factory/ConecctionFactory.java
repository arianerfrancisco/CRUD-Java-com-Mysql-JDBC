package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConecctionFactory {
	
	private static final String USARNAME = "root";
	
	private static final String PASSWORD= "";
	
// caminho do banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	/*
	 *  Conexão com o banco de dados
	 */
	private static final Connection createConnectionToMySQL() throws Exception  {
	
// faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
// Cria conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USARNAME, PASSWORD);
		
		return connection;
	}
	
// para garantir apenas uma conexão ativa por usuario
	
	private static void main(String[] args ) {
		
//Recuperar uma conexão com o banco de dados
		Connection on =  createConnectionToMySQL();
		
		// Testar se a conexão é nula 
		if(con!null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
		
	}
}
