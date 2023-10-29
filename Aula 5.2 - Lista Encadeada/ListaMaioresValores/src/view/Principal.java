package view;

import br.edu.fatec.zl.Lista.Lista;
import controller.MaioresValoresController;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Lista<Integer> lista = new Lista<>();
		MaioresValoresController methods = new MaioresValoresController();
		int[] vetor = {3, 5, 8, 12, 9, 7, 6, 2, 3, 7, 16};
		int tamanhoVetor= vetor.length;

		//Preenche a lista com os números do vetor
		for(int i = 0; i < tamanhoVetor; i++) {
			try {
				lista.add(vetor[i], i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Metodo para mostrar os 2 maiores valores da lista
		methods.doisMaiores(lista);

	}
}
