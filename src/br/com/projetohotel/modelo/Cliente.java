package br.com.projetohotel.modelo;

public class Cliente extends Usuario {
	private int clienteId;
	private String endereco;
	private String telefone;
	private String email;

	public Cliente( String nome, String senha, String endereco, String telefone, String email) {
		super(nome, senha);
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Cliente( String nome, String telefone, String email) {
		super(nome);
		this.telefone = telefone;
		this.email = email;
	}


	public Cliente(int usuarioId, String nome, String senha, int clienteId, String endereco, String telefone,
			String email) {
		super(usuarioId, nome, senha);
		this.clienteId = clienteId;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public int getClienteId() {
		return clienteId;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {

		return senha;
	}

	public String getNome() {

		return nome;
	}

	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", endereco=" + endereco + ", telefone=" + telefone + ", email="
				+ email + "]";
	}
	
	

}