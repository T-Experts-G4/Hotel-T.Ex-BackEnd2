package br.com.projetohotel.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Hotel {

	private int id;
	private String nome;
	private Endereco endereco;
	private List<Quarto> quartos = new LinkedList<Quarto>();
	private List<Usuario> funcionarios = new LinkedList<Usuario>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Reserva> reservas = new ArrayList<Reserva>();

	public Hotel(int id, String nome, Endereco endereco) {

		this.nome = nome;
		this.id = id;
		this.endereco = endereco;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Quarto> getQuartos() {

		return Collections.unmodifiableList(quartos);
	}

	public List<Usuario> getFuncionarios() {
		return Collections.unmodifiableList(funcionarios);
	}
	
	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public List<Cliente> getClientes() {
		return Collections.unmodifiableList(clientes);
	}

	public void adicionaQuarto(Quarto quarto) {
		this.quartos.add(quarto);
	}

	public void adicionaFuncionario(Usuario funcionario) {
		this.funcionarios.add(funcionario);

	}

	public void adicionaCliente(Cliente cliente) {
		this.clientes.add(cliente);

	}
	
	public void adicionaReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}

	@Override
	public String toString() {

		return "Informações do Hotel" + "\nId: " + id + "\nNome : " + nome + "\nEndereco: " + endereco
				+ "\nQuantidade de Quartos: " + quartos.size() 
				+ "\nQuantidade de Funcionários: " + funcionarios.size()
				+ "\nQuantidade de Clientes: " + clientes.size()
				+ "\nQuantidade de Reservas: "+ reservas.size();
	}
}