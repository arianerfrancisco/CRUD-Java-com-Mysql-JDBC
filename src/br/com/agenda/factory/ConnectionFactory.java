package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String USARNAME = "root";
	
	private static final String PASSWORD= "";
	
// caminho do banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	/*
	 *  Conex�o com o banco de dados
	 */
	public static Connection createConnectionToMySQL() throws Exception  {
	
// faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
// Cria conex�o com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USARNAME, PASSWORD);
		
		return connection;
	}
	
// para garantir apenas uma conex�o ativa por usuario
	
	public  static void main(String[] args ) throws Exception  {
		
//Recuperar uma conex�o com o banco de dados
		Connection con =  createConnectionToMySQL();
		
		// Testar se a conex�o � nula 
		if(con!=null) {
			System.out.println("Conex�o obtida com sucesso!");
			con.close();
		}
		
	}
}
