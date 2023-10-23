package view;

import br.edu.fatec.zl.Lista.Lista;
import controller.OrdenarController;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Lista<Integer> lista = new Lista<>();
		OrdenarController ordenar = new OrdenarController();
		int[] vetor = {10, 5, 8, 1, 9, 2, 4, 7, 3, 6};
		
		//Preencher Lista
		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i], i);
		}
		
		//Mostrar Lista original
		int tamanho = lista.size();
		System.out.println("Lista Original");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("#" + i + " = " + lista.get(i));
		}
		
		//Bubble Sort
		ordenar.bubbleSort(lista);
		
		//Mostar Lista Ordenada
		System.out.println("\nLista Ordenada");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("#" + i + " = " + lista.get(i));
		}
		
	}

}
