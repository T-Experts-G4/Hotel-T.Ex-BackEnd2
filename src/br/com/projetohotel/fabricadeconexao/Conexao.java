package br.com.projetohotel.fabricadeconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection criaConexao() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/htex", "root", "Rene2018");

	}
}
