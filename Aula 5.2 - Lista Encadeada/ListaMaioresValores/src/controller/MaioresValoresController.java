package controller;

import br.edu.fatec.zl.Lista.Lista;

public class MaioresValoresController {

		public MaioresValoresController() {
			super();
		}

		public void doisMaiores(Lista<Integer> lista) throws Exception {
		
			int tamanho = lista.size();
			int maior1 = lista.get(0);
			int maior2 = lista.get(0);

			for(int i = 0; i < tamanho; i++) {
				int valor = lista.get(i);
				if(valor > maior1) {
					maior2 = maior1;
					maior1 = valor;
				} else if(valor > maior2 && valor != maior1) {
					maior2 = valor;
				}
			}
			
			System.out.println("1o. maior valor = " + maior1);
			System.out.println("2o. maior valor = " + maior2);
		}
}
