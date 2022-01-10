package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import com.mysql.jdbc.PreparedStatement;
import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

// aplica-se aqui a DAO e realiza-se toda a parametrização > fazendo que o java se molde ao BD
// aqui fica a regra de negócio
public class ContatoDAO {
	
	public void save(Contato contato) {
		String sql = "INSERT INTO contatos(nome, idade, dataCadastro) VALUES (?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		// caso banco não esteja disponivel, faz-se tentativas
		
		try {
			// criar uma conexao com o BD
			conn = ConnectionFactory.createConnectionToMySQL();	
			
			// criamos uma pstm para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// adicionar os valores que sao esperados pela query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
		}
	}

}
