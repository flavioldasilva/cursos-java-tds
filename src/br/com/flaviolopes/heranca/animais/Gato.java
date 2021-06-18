package br.com.flaviolopes.heranca.animais;

public class Gato extends Animal {
	
	public String getNome() {
		if (this.nome != null) {
			return this.nome;
		} else {
			return "nome indefinido";
		}
	}
	
	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}
	
	public void setIdade(int idade) {
		// if ternario
		// [condicao] ? [caso verdadeiro] : [else]
		this.idade = idade < 0 ? 0 : idade;
	}

	@Override
	public String getAlimento() {
		// TODO Auto-generated method stub
		return null;
	}
	

}


