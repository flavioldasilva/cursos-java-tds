package javabasico.classesearrays;

public class Fabrica {

	public Produto produzir(int produto) {
		if (RegistroDeProducao.produtos.length > produto) {
			@SuppressWarnings("static-access")
			String nomeProduto = new RegistroDeProducao().produtos[produto];
			Produto novoProduto = new Produto();
			novoProduto.descricao = nomeProduto;
			return novoProduto;
		}
		Produto novoProduto = new Produto();
		novoProduto.descricao = "Produto Indefinido";
		return novoProduto;
	}

	public Produto[] rodarEsteira(int produto, int qtd, int diaDaSemana) {
		Produto[] produtos = new Produto[qtd];
		for (int contador = 0; contador < qtd; contador++) {
			produtos[contador] = produzir(produto);
		}
		@SuppressWarnings("unused")
		int numeroDeExecucoes = RegistroDeProducao.registroSemanal[diaDaSemana][produto][0];
		@SuppressWarnings("unused")
		int qtdProduzida = RegistroDeProducao.registroSemanal[diaDaSemana][produto][1];

		return produtos;
	}

	public void executarLinhaDeProducao(String linha, int qtd, int diaDaSemana) {
		switch(linha) {
		case "Linha01":
			rodarEsteira(0, qtd, diaDaSemana);
			break;

		case "linha02":
			rodarEsteira(1, qtd, diaDaSemana);
			break;

		case "LINHA_PRODUCAO_AGUA":
			Produto[] produtos = rodarEsteira(2, qtd, diaDaSemana);
			for (int i = 0; i < produtos.length; i++) {
				System.out.println("------");
				System.out.println("Produto ID: " + produtos[i].id);
				System.out.println("Produto produzido: " + produtos[i].descricao);
			}
			break;

		case "Linha04":
			rodarEsteira(3, qtd, diaDaSemana);
			break;

		case "Linha05":
			rodarEsteira(4, qtd, diaDaSemana);
			break;
		}
	}

}
