package br.com.projetohotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetohotel.fabricadeconexao.Conexao;
import br.com.projetohotel.modelo.Usuario;


public class UsuarioDAO {

	
	public void insert(Usuario usuario) throws SQLException {
		Connection conn = Conexao.criaConexao();
		
		String sql = "insert into usuario (nome, senha) values (?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, nome);
		st.setString(2,senha);
		
		st.execute();
		System.out.println("Usuario: " + nome + " adicionado com sucesso.");
		
		st.close();
		conn.close();
	}
	
	public List<Usuario> lista() throws SQLException {
		Connection conn = Conexao.criaConexao();
		
		String sql = "select id, nome, senha from usuario";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<Usuario> usuarios = new ArrayList<>();
		
		while(rs.next()) {
			Usuario usuario = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3));
			usuarios.add(usuario);
		}
			rs.close();
			st.close();
			conn.close();
			
			return usuarios;
	}
}
