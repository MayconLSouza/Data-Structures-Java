package controller;

import br.edu.fatec.zl.Lista.Lista;

public class OrdenarController {

	public OrdenarController() {
		super();
	}
	
	public void bubbleSort(Lista<Integer> lista) throws Exception {
		int tamanho = lista.size();
		boolean troca;
		do {
			troca = false;
			for (int i = 0; i < tamanho - 1; i++) {
				if(lista.get(i) > lista.get(i+1)) {
					int aux = lista.get(i+1);
					lista.remove(i+1);
					lista.add(lista.get(i), i+1);
					lista.remove(i);
					lista.add(aux, i);
					troca = true;
				}
			}
			tamanho -= 1;
		} while (troca == true);
	}

}
