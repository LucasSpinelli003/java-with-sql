package br.com.fiap.banco.exercicio;

import java.sql.Statement;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exercicio {
	
	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "pf0392", "fiap");
			System.out.println("-> Conectado <-");
			FileWriter output = new FileWriter("alunos4.csv");
			PrintWriter arquivo = new PrintWriter(output);
			
			Statement stm = conn.createStatement();
			ResultSet rst = stm.executeQuery("SELECT * FROM TB_ALUNO");
			
			arquivo.println("rm" + "," + "nome" + "," + "ativo"+ "," + "nota1"+ "," + "nota2");
			
			while(rst.next()) {
				int rm = rst.getInt("nr_rm");
				String name = rst.getString("nm_aluno");
				int ativo = rst.getInt("st_ativo");
				double resultOfTest1 = rst.getDouble("vl_nota1");
				double resultOfTest2 = rst.getDouble("vl_nota2");	
				
				
				arquivo.println(rm + "," + name + "," + ativo + "," + resultOfTest1 + "," + resultOfTest2 );
			}
			
			System.out.println("Alunos adicionados no arquivo.");
			
			System.out.println("Desconectando ...");
			conn.close();
			output.close();
			arquivo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
