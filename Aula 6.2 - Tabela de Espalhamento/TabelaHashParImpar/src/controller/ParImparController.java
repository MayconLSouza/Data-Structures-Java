package controller;

import br.edu.fatec.zl.Lista.Lista;

@SuppressWarnings("unchecked")
public class ParImparController {
	
	Lista<Integer>[] hashTable;

	public ParImparController() {
		hashTable = new Lista[2];
		for(int i = 0; i < 2; i++) {
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
				for (int j = 1; j < tamanho; j++) {
					System.out.print(hashTable[i].get(j) + " -> ");
				}
				System.out.println("NULL");
			}
		}
	}

	private int hash(int valor) {
		return valor % 2;
	}

}
