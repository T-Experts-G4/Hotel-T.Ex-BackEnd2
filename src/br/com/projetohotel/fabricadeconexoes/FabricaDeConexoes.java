package br.com.projetohotel.fabricadeconexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	
	public static Connection criaConexao() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://144.22.161.72/htex", "root", "1234");

	}
}
