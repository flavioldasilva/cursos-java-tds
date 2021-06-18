package br.com.flaviolopes.heranca.animais;

public abstract class Animal extends AlimentacaoAnimais {
	
	protected String nome;
	protected String sexo;
	protected int idade;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
