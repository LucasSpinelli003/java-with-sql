package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploPesquisa {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm97757", "101203");
			System.out.println("-> Conectado <-");
			Statement stm = conn.createStatement();
			ResultSet rst = stm.executeQuery("SELECT * FROM T_PRODUTO");
			while(rst.next()) {
				int id = rst.getInt("cd_produto");
				String nome = rst.getString("nm_produto");
				double estoque = rst.getDouble("vl_venda");
				double compra = rst.getDouble("vl_compra");
				double venda = rst.getDouble("vl_venda");
				System.out.println("nr_produto: " + id + "| nm_produto: " + nome + "| nr_estoque: " + estoque + "| vl_compra: " + compra + "| vl_venda: " + venda);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
	}
	
}
