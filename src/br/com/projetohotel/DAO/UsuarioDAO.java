package br.com.projetohotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetohotel.fabricadeconexoes.FabricaDeConexoes;
import br.com.projetohotel.modelo.Usuario;


public class UsuarioDAO {

	
	public void insereUsuario(Usuario usuario) throws SQLException {
		Connection conn = FabricaDeConexoes.criaConexao();
		
		String sql = "insert into usuario (nome, senha) values (?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, usuario.getNome());
		st.setString(2, usuario.getSenha());
		
		st.execute();
		System.out.println("Usuario: " + usuario.getNome() + " adicionado com sucesso.");
		
		st.close();
		conn.close();
		return;
	}
	
	public List<Usuario> lista() throws SQLException {
		Connection conn = FabricaDeConexoes.criaConexao();
		
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
	
	public void atualizaUsuario(Usuario usuario) throws SQLException {
	    Connection conn = FabricaDeConexoes.criaConexao();
		
		String sql = "update usuario set nome = ?, senha = ? where id = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, usuario.getNome());
		st.setString(2, usuario.getSenha());
		st.setInt(3, usuario.getUsuarioId());
		
		st.execute();
		System.out.println("Usuario alterado com sucesso!" );
		
		st.close();			
		conn.close();
	}
	
	public void deletaUsuario(int id) throws SQLException {
		 Connection conn = FabricaDeConexoes.criaConexao();
			
			String sql = "delete from usuario where id = ?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, id);
			
			st.execute();
			System.out.println("Usuario deletado com sucesso!" );
			
			st.close();			
			conn.close();
	}

	public Usuario buscaPor(int id) throws SQLException {
		Usuario usuario = null;
		
		Connection conn = FabricaDeConexoes.criaConexao();
		
		String sql = "select * from usuario where id = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			usuario = new Usuario(
					rs.getInt("id"),
					rs.getString("nome"),
					rs.getString("senha")
					);
		}
		rs.close();
		st.close();
		conn.close();
		return usuario;
	}


	
}
