package controller;

import br.edu.fatec.zl.Lista.Lista;

@SuppressWarnings("unchecked")
public class Controller100posicoes {
	

	Lista<Integer>[] hashTable;
	
	public Controller100posicoes() {
		hashTable = new Lista[100];
		int tamanho = hashTable.length;
		for (int i = 0; i < tamanho; i++) {
			hashTable[i] = new Lista<Integer>();
		}
	}
	
	public void op(int[] vetor) throws Exception {
		//Preencher
		for (int valor : vetor) {
			int posicao = hash(valor);
			hashTable[posicao].addLast(valor);
		}

		//Exibir
		int tamanhoHashTable = hashTable.length;
		for (int i = 0; i < tamanhoHashTable; i++) {
			if (!hashTable[i].isEmpty()) {
				System.out.print("#" + i + ": ");
				int tamanho = hashTable[i].size();
				for (int j = 0; j < tamanho; j++) {
					System.out.print(hashTable[i].get(j) + " -> ");
				}
				System.out.println("NULL");
			}
		}
	}

	private int hash(int numero) {
		int posicao = (int) (100 * ( ( ( (Math.sqrt(7) - 1) / 2 ) * numero ) % 1));
		return posicao;
	}

}
