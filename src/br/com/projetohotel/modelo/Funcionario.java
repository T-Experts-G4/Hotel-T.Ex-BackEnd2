package br.com.projetohotel.modelo;

public class Funcionario extends Usuario {
	private int matricula;
	private String cargo;
	private String email;

	public Funcionario(String nome, String senha, int matricula, String cargo, String email) {
		super(nome, senha);
		this.matricula = matricula;
		this.cargo = cargo;
		this.email = email;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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

}