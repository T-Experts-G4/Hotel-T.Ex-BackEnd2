package br.com.projetohotel.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.projetohotel.DAO.ClienteDAO;
import br.com.projetohotel.DAO.UsuarioDAO;
import br.com.projetohotel.modelo.Cliente;
import br.com.projetohotel.modelo.Usuario;

public class Teste {

	public static void main(String[] args) throws SQLException {
		
		List<Usuario> usuarios = new UsuarioDAO().lista();
		usuarios.forEach(usuario -> System.out.println(usuario));
		
		System.out.println("    ");
		System.out.println("    ");
		
		List<Cliente> clientes = new ClienteDAO().lista();
		clientes.forEach(cliente -> System.out.println(cliente.getNome()+" "+ cliente.getEmail()+" "+ cliente.getTelefone()));
		
		System.out.println("    ");
		System.out.println("    ");
		
		//UsuarioDAO insereUsuario = new UsuarioDAO();
		//insereUsuario.insert("Silvio","senha1");
		
		System.out.println("    ");
		System.out.println("    ");
		
		ClienteDAO inserecliente = new ClienteDAO();
		inserecliente.insereCliente("71988447722","silvio@email.com",2);
		
		}

}
