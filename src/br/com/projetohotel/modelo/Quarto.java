package br.com.projetohotel.modelo;

public class Quarto {
	private int numero;
	private double precoDiaria;
	private boolean disponivel;

	public Quarto(int numero, double precoDiaria) {
		this.numero = numero;
		this.precoDiaria = precoDiaria;
		this.disponivel = true;
	}

	public int getNumero() {
		return numero;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	@Override
	public String toString() {
		
		return "Quarto: " + numero + " Diaria: " + precoDiaria; 
	}
}
