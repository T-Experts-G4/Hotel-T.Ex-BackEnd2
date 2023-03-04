package br.com.projetohotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetohotel.fabricadeconexao.Conexao;
import br.com.projetohotel.modelo.Cliente;

public class ClienteDAO {

	public void insereCliente (String telefone, String email, int usuarioId) throws SQLException {
		Connection conn = Conexao.criaConexao();
		
		String sql = "insert into cliente (telefone, email, usuario_id) values (?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, telefone);
		st.setString(2, email);
		st.setInt(3, usuarioId);
		
		st.execute();
		
		st.close();			
		conn.close();
	}
	
	public List<Cliente> lista() throws SQLException {
		Connection conn = Conexao.criaConexao();
		
		String sql = "select usuario.nome,cliente.telefone,cliente.email from cliente join usuario on cliente.id=usuario.id";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<Cliente> clientes = new ArrayList<>();
		
		while(rs.next()) {
			Cliente cliente = new Cliente(rs.getString(1),rs.getString(2),rs.getString(3));
			clientes.add(cliente);
		}
			rs.close();
			st.close();
			conn.close();
			
			return clientes;
	}
}
