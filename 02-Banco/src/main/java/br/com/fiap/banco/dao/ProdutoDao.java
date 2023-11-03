package br.com.fiap.banco.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.banco.model.Produto;

public class ProdutoDao {
	
	
	
	public void Cadastrar(Produto produto) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm97757", "101203");
			System.out.println("-> Conectado <-");
			
			Statement stm = conn.createStatement();
			stm.executeUpdate("ISERT INTO T_PRODUTO");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
