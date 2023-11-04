package view;

import controller.Controller5posicoes;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Controller5posicoes methods = new Controller5posicoes();

		methods.gerarTabelaOriginal();
		methods.exibirTabelaOriginal();
		methods.gerarNovaTabela();
		methods.exibirNovaTabela();
		
	}
	


}
