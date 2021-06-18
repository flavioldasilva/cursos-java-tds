package br.com.flaviolopes.heranca.animais;

public abstract class AlimentacaoAnimais {
	
	private String alimento;
	
	abstract public String getAlimento();
	
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	

}
