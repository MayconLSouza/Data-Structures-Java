package controller;

import br.edu.fatec.zl.Lista.Lista;

@SuppressWarnings("unchecked")
public class Controller5posicoes {
	
	Lista<Integer>[] hashTableOrigin;
	Lista<Integer>[] hashTableNew;
	int[][] tabelaOriginal = {{12, 647, 158, 136, 467},
            {156, 600, 551},
            {263, 414, 882, 945, 914, 953, 629},
            {884, 795, 194, 513},
            {591, 847, 66, 337, 979},
            {768, 53},
            {114, 803, 90, 339, 550},
            {574, 977, 216, 99, 617, 88},
            {142, 148, 227, 939, 585, 338, 206},
            {569, 708, 844}};

	public Controller5posicoes() {
		hashTableOrigin = new Lista[10];
		for(int i = 0; i < 10; i++) {
			hashTableOrigin[i] = new Lista<Integer>();
		}
		hashTableNew = new Lista[5];
		for (int i = 0; i < 5; i++) {
			hashTableNew[i] = new Lista<Integer>();
		}
	}
	
	public void gerarTabelaOriginal() throws Exception {
		//Preencher
		for(int i = 0; i < 10; i++) {
			for(int j = 0 ; j < tabelaOriginal[i].length; j++) {
				hashTableOrigin[i].addLast(tabelaOriginal[i][j]);
			}
		}
	}
	
	public void exibirTabelaOriginal() throws Exception {
		//Exibir
		System.out.println("Tabela Original: ");
		int tamanhoHashTable = hashTableOrigin.length;
		for (int i = 0; i < tamanhoHashTable; i++) {
			if (!hashTableOrigin[i].isEmpty()) {
				System.out.print("#" + i + ": ");
				int tamanho = hashTableOrigin[i].size();
				for (int j = 0; j < tamanho; j++) {
					System.out.print(hashTableOrigin[i].get(j) + " -> ");
				}
				System.out.println("NULL");
			}
		}
	}

	public void gerarNovaTabela() throws Exception {
		//Preencher
		int tamanhoHashTable = hashTableOrigin.length;
		for (int i = 0; i < tamanhoHashTable; i++) {
			if (!hashTableOrigin[i].isEmpty()) {
				int tamanho = hashTableOrigin[i].size();
				for (int j = 0; j < tamanho; j++) {
					int valor = hashTableOrigin[i].get(j);
					int posicao = hash(valor);
					hashTableNew[posicao].addLast(valor);
				}
			}
		}
		
		
	}

	public void exibirNovaTabela() throws Exception {
		//Exibir
		System.out.println("\nNova Tabela: ");
		int tamanhoHashTable = hashTableNew.length;
		for (int i = 0; i < tamanhoHashTable; i++) {
			if (!hashTableNew[i].isEmpty()) {
				System.out.print("#" + i + ": ");
				int tamanho = hashTableNew[i].size();
				for (int j = 0; j < tamanho; j++) {
					System.out.print(hashTableNew[i].get(j) + " -> ");
				}
				System.out.println("NULL");
			}
		}
	}

	private int hash(int valor) {
		return valor % 5;
	}

}
