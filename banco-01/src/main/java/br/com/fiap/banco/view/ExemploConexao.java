package br.com.fiap.banco.view;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploConexao {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm97757", "101203");
			System.out.println("-> Conectado <-");
			
			conn.close(); //fecha a conexão
			
		} catch (ClassNotFoundException e) {
			System.out.println("O driver JDBC não foi encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Não foi possível conectar no banco de dados");
			e.printStackTrace();
		}
		
		
	}

}
