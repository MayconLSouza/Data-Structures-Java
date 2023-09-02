package view;

import controller.TempoController;

public class Principal {

	public static void main (String[] args) {
		int[] vetor = new int [1500];
		int tamanho = vetor.length;
		TempoController tempo = new TempoController();
		
		//Preencher o vetor
		for(int i = 0; i < 1500; i++) {
			vetor[i] = (1500 - (i+1));
		}

		//Bubble Sort
		tempo.bubbleSort(vetor);

		//Preencher o vetor
		for(int i = 0; i < 1500; i++) {
			vetor[i] = (1500 - (i+1));
		}

		//Merge Sort
		tempo.mergeSort(vetor, 0, tamanho - 1);

		//Preencher o vetor
		for(int i = 0; i < 1500; i++) {
			vetor[i] = (1500 - (i+1));
		}

		//Quick Sort
		tempo.quickSort(vetor, 0, tamanho - 1);

	}

}