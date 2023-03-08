package br.com.projetohotel.modelo;

public class Cliente {
	private int clienteId;
	private String endereco;
	private String telefone;
	private String email;
	private int usuarioId;

	public Cliente( String endereco, String telefone, String email, int usuarioId) {
		
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.usuarioId = usuarioId;
	}
	
	public Cliente( String telefone, String email) {
		
		this.telefone = telefone;
		this.email = email;
	}
	
	public Cliente(String telefone, String email, int usuarioId) {
		this.telefone = telefone;
		this.email = email;
		this.usuarioId = usuarioId;
	}


	public Cliente(int usuarioId, int clienteId, String endereco, String telefone,
			String email) {
		this.clienteId = clienteId;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Cliente( String endereco, String telefone, String email) {
			
			this.endereco = endereco;
			this.telefone = telefone;
			this.email = email;
	}
	
	public Cliente( int clienteId, String telefone, String email) {
		
		this.clienteId = clienteId;
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

		
	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", endereco=" + endereco + ", telefone=" + telefone + ", email="
				+ email + "]";
	}
	
	

}