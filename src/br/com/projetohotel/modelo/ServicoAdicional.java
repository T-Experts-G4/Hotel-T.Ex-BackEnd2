package br.com.projetohotel.modelo;

public class ServicoAdicional {
	private String descricao;
	private double preco;

	public ServicoAdicional(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
	    this.preco = preco;
	  }
}
