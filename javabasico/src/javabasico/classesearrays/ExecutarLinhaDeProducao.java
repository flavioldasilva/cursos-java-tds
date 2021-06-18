package javabasico.classesearrays;

public class ExecutarLinhaDeProducao {
	
	public void imprimirRegistro() {
		for (int i = 0; i < RegistroDeProducao.diaDaSemana.length; i++) {
			System.out.println("------------\n\n");
			System.out.println("--- > " + RegistroDeProducao.diaDaSemana[i]);
			
			for (int j = 0; j < RegistroDeProducao.produtos.length; j++) {
				if(RegistroDeProducao.registroSemanal[i][j][0] > 0) {
					System.out.println("Nome: " + RegistroDeProducao.produtos[j]);
					System.out.println("Execuções: " + RegistroDeProducao.registroSemanal[i][j][0]);
					System.out.println("Qtd produzida: " + RegistroDeProducao.registroSemanal[i][j][1]);
					System.out.println("=====\n");
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica();
		fabrica.executarLinhaDeProducao("Linha01", 5, 3);
		
		fabrica.executarLinhaDeProducao("LINHA_PRODUCAO_AGUA", 3, 1);
		fabrica.executarLinhaDeProducao("LINHA_PRODUCAO_AGUA", 3, 1);
		fabrica.executarLinhaDeProducao("LINHA_PRODUCAO_AGUA", 3, 1);
		
		new ExecutarLinhaDeProducao().imprimirRegistro();
	}

}
