package controller;

import br.edu.fateczl.ordenacao.quicksort.QuickSort;
import br.edu.fatec.zl.sort.bubblesort.BubbleSort;
import br.edu.fatec.zl.sort.mergesort.MergeSort;

public class TempoController {

	public TempoController() {
		super();
	}

	//BubbleSort
	public void bubbleSort(int[] vetor) {
		BubbleSort bubbleSort = new BubbleSort();

		double tempoInicial = System.nanoTime();
		vetor = bubbleSort.classico(vetor);
		double tempoFinal = System.nanoTime();
        	// Calcula tempo total de nano para segundos
        	double tempoTotalS = (tempoFinal - tempoInicial) / Math.pow(10, 9);
        	double tempoTotalMs = (tempoFinal - tempoInicial) / Math.pow(10, 6);
        	System.out.println("Tempo em segundos para ordenacao bubble sort: " + String.format("%.7f", tempoTotalS) + " s");
        	System.out.println("Tempo em milisegundos para ordenacao bubble sort: " + String.format("%.7f", tempoTotalMs) + " ms\n");
	}

	//MergeSort
	public void mergeSort(int[] vetor, int inicio, int fim) {
		MergeSort mergeSort = new MergeSort();

		double tempoInicial = System.nanoTime();
		vetor = mergeSort.mergeSort(vetor, inicio, fim);
		double tempoFinal = System.nanoTime();
        	// Calcula tempo total de nano para segundos
        	double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
        	double tempoTotalMs = (tempoFinal - tempoInicial) / Math.pow(10, 6);
        	System.out.println("Tempo em segundos para ordenacao merge sort:  " + String.format("%.7f", tempoTotal) + " s");
        	System.out.println("Tempo em milisegundos para ordenacao merge sort: " + String.format("%.7f", tempoTotalMs) + " ms\n");
	}

	//QuickSort
	public void quickSort(int[] vetor, int inicio, int fim) {
		QuickSort quickSort = new QuickSort();

		double tempoInicial = System.nanoTime();
		vetor = quickSort.quickSort(vetor, inicio, fim);
		double tempoFinal = System.nanoTime();
        	// Calcula tempo total de nano para segundos
        	double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
        	double tempoTotalMs = (tempoFinal - tempoInicial) / Math.pow(10, 6);
        	System.out.println("Tempo em segundos para ordenacao quick sort:  " + String.format("%.7f", tempoTotal) + " s");
        	System.out.println("Tempo em milisegundos para ordenacao quick sort: " + String.format("%.7f", tempoTotalMs) + " ms\n");
	}

}
		