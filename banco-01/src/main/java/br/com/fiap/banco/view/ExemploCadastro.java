package br.com.fiap.banco.view;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploCadastro {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm97757", "101203");
			System.out.println("-> Conectado <-");
	
			
			Statement stm = conn.createStatement();
			stm.executeUpdate("INSERT INTO T_PRODUTO(cd_produto, nm_produto, nr_estoque, vl_venda,vl_compra) values(3,'churros',1000,10,5.50)");
			System.out.println("Update efetuado com sucesso!");
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("O driver JDBC não foi encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Não foi possível conectar no banco de dados");
			e.printStackTrace();
		}
		
		
	}

}
