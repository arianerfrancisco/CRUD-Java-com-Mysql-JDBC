package br.com.agenda.dao;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import br.com.agenda.model.Contato;

// aplica-se aqui a DAO e realiza-se toda a parametrização > fazendo que o java se molde ao BD
// aqui fica a regra de negócio
public class ContatoDAO {
	
	public void save(Contato contato) {
		String sql = "INSERT INTO contatos(nome, idade, dataCadastro) VALUES (?,?,?)";
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
	}

}
