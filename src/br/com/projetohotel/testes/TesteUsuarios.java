package br.com.projetohotel.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.projetohotel.DAO.ClienteDAO;
import br.com.projetohotel.DAO.UsuarioDAO;
import br.com.projetohotel.modelo.Usuario;

public class TesteUsuarios {

	public static void main(String[] args) throws SQLException {
		
		//Cria usuario
		
//		UsuarioDAO insereUsuarios = new UsuarioDAO();
//		Usuario user = new Usuario("Adriano","senha4");
//		insereUsuarios.insereUsuario(user);
//		
		System.out.println("    ");
		System.out.println("    ");
		
		//Lista Usuario
		
		List<Usuario> usuarios = new UsuarioDAO().lista();
		usuarios.forEach(usuario -> System.out.println(usuario));
		
		System.out.println("    ");
		System.out.println("    ");
		
//      Atualiza usuario
		
//		UsuarioDAO dao = new UsuarioDAO();
//		Usuario usuario = dao.buscaPor(10);
//		
//		System.out.println(usuario);
//
//		usuario.setNome("NovoNome");
//		usuario.setSenha("senhanova");
//		
//		dao.atualizaUsuario(usuario);
//		
//		Usuario usuarioAlterado = dao.buscaPor(10);
//		System.out.println(usuarioAlterado);
		
		//Deleta usuario
		UsuarioDAO dao = new UsuarioDAO();
		dao.deletaUsuario(3);
	
	
		}

}
