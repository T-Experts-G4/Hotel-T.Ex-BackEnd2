package br.com.projetohotel.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.projetohotel.DAO.ClienteDAO;
import br.com.projetohotel.modelo.Cliente;

public class TesteClientes {

	public static void main(String[] args) throws SQLException {
		
		//    Cria Cliente
		
//		ClienteDAO insereClientes = new ClienteDAO();
//		Cliente cliente = new Cliente("85987876464","adriano@tex.com",4);
//		insereClientes.insereCliente(cliente);
//		
		System.out.println("    ");
		System.out.println("    ");
		
		//Lista Clientes
		List<Cliente> clientes = new ClienteDAO().lista();
		clientes.forEach(listaCliente -> System.out.println(listaCliente.getEmail()+" "+ listaCliente.getTelefone()));
		
		System.out.println("    ");
		System.out.println("    ");
		
		//Atualiza cliente
		
//		ClienteDAO dao = new ClienteDAO();
//		Cliente cliente = dao.buscaPor(10);
//		
//		System.out.println(cliente);
//
//		cliente.setTelefone("85987876262");
//		cliente.setEmail("adriano@hoteltex.com");
//		
//		dao.atualizaCliente(cliente);
//		
//		Cliente clienteAlterado = dao.buscaPor(10);
//		System.out.println(clienteAlterado);
		
		//Deleta cliente
		ClienteDAO dao = new ClienteDAO();
		dao.deletaCliente(3);
	}

}
