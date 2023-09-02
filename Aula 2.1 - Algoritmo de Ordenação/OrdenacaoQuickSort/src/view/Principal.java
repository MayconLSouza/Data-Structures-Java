package view;

import java.util.Arrays;

import br.edu.fateczl.ordenacao.quicksort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
		int tamanho;
		
		QuickSort ordenar = new QuickSort();
		
		//Exercício 1
		tamanho = vetor1.length;
		vetor1 = ordenar.quickSort(vetor1, 0, tamanho - 1);
		System.out.println("Vetor 1 = "+ Arrays.toString(vetor1));
		
		//Exercício 2
		tamanho = vetor2.length;
		vetor2 = ordenar.quickSort(vetor2, 0, tamanho - 1);
		System.out.println("Vetor 1 = "+ Arrays.toString(vetor2));
		
		//Exercício 3
		tamanho = vetor3.length;
		vetor3 = ordenar.quickSort(vetor3, 0, tamanho - 1);
		System.out.println("Vetor 1 = "+ Arrays.toString(vetor3));
		
	}

}
