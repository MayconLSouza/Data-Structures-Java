package br.edu.fatec.zl.sort.bubblesort;

public class BubbleSort {

	public BubbleSort() {
		super();
	}
	
	//Bubble Sort clssico
	public int[] classico(int[] vetor) {
		int tamanho = vetor.length;
		
		//Rodadas
		for(int i = 0; i < tamanho; i++ ) {
			//Dinâmica
			for(int j = 0; j < (tamanho - 1); j++) {
				if(vetor[j] > vetor[j+1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}	// fim if
				
			}	// fim for dinâmica
			
		}	// fim for rodadas
		
		//Vetor Ordenado
		return vetor;
		
	}	// fim da função bubble sort clássico
	
	//Bubble Sort otimizado
	public int[] otimizado(int[] vetor) {
		int tamanho = vetor.length;
		boolean troca;		//flag que identifica final da ordenção
			
		do {
			troca = false;
			for(int i = 0; i < (tamanho-1); i++) {
				if (vetor[i] > vetor[i+1]) {
					int aux = vetor[i+1];
					vetor[i+1] = vetor[i];
					vetor[i] = aux;
					troca = true;
				}	//fim if
			}	//fim for
			tamanho -= 1;
		} while (troca == true);
		
		//Vetor Ordenado
		return vetor;
			
	}	// fim da função bubble sort otimizado
	
}	// fim da classe
