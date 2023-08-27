package view;

import br.edu.fatec.zl.sort.bubblesort.BubbleSort;
import br.edu.fatec.zl.sort.mergesort.MergeSort;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		
		
		//Bubble Sort
		BubbleSort bubbleSort = new BubbleSort();
		
		//Classico
		vetor1 = bubbleSort.classico(vetor1);
		//Otimizado
		//vetor1 = bubbleSort.otimizado(vetor1);
		System.out.println(Arrays.toString(vetor1));
		
		//Merge Sort
		MergeSort mergeSort = new MergeSort();
		vetor2 = mergeSort.mergeSort(vetor2, 0, vetor2.length - 1);
		System.out.println(Arrays.toString(vetor2));
		
	}

}
