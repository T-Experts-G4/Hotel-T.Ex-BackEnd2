package br.com.projetohotel.modelo;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
	private Cliente cliente;
	private Quarto quarto;
	private String emailCliente;
	private String numeroQuarto;
	private int dias;
	private List<ServicoAdicional> servicoAdicional = new ArrayList<ServicoAdicional>();

	public Reserva(String emailCliente, String numeroQuarto, int dias) {
		this.emailCliente = emailCliente;
		this.numeroQuarto = numeroQuarto;
		this.dias = dias;
	}

	public Reserva(Cliente cliente, Quarto quarto, int dias) {
		super();
		this.cliente = cliente;
		this.quarto = quarto;
		this.dias = dias;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getQuarto() {
		return numeroQuarto;
	}

	public int getDias() {
		return dias;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public String getNumeroQuarto() {
		return numeroQuarto;
	}

	public List<ServicoAdicional> getServicoAdicional() {
		return servicoAdicional;
	}

	public double calcularPreco() {
		return quarto.getPrecoDiaria() * dias;
	}

	public void adicionaServicoAdicional(ServicoAdicional servicoAdicional) {
		this.servicoAdicional.add(servicoAdicional);

	}

	@Override
	public String toString() {
		return "Reserva \ncliente=" + cliente.getNome() + "\n, " + quarto + "\n, emailCliente=" + cliente.getEmail()
				+ "\n, dias=" + dias + "\n, servicoAdicional=" + servicoAdicional + "]";
	}

}
