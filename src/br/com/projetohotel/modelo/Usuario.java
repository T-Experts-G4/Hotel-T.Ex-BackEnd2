package br.com.projetohotel.modelo;

public class Usuario { //era uma classe abstrata - não instancia
	private int usuarioId;
	protected String nome;
	protected String senha;

	

	public Usuario(int usuarioId, String nome, String senha) {
		this.usuarioId = usuarioId;
		this.nome = nome;
		this.senha = senha;
	}
	
	
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public Usuario(String nome) {
		this.nome = nome;
	}

	public int getUsuarioId() {
		return usuarioId;
	}


	public String getNome() {
		return nome;
	}


	public String getSenha() {
		return senha;
	}

	
	
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public String toString() {
		return "Usuario [usuarioId=" + usuarioId + ", nome=" + nome + ", senha=" + senha + "]";
	}


	public boolean autenticar(String nome, String senha) {
		return this.nome.equals(nome) && this.senha.equals(senha);
	}
}