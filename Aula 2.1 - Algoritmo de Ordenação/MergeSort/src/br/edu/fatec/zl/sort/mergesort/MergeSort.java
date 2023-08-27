package br.edu.fatec.zl.sort.mergesort;

public class MergeSort {

	public MergeSort() {
		super();
	}
	
	public int[] mergeSort(int[] vetorPrincipal, int inicio, int fim) {

		//Verifica se o vetor chegou em 1 posição
		if (inicio < fim) {
			
			int meio = (inicio + fim) / 2;		//Encontra a posição do meio do vetor
			
			//Recursiva que divide o vetor;
			mergeSort(vetorPrincipal, inicio, meio);		//Vetor à esquerda
			mergeSort(vetorPrincipal, meio + 1, fim);		//Vetor à direita
			intercala(vetorPrincipal, inicio, meio, fim);
			
		}	//fim da condicional
		
		//Vetor Ordenado
		return vetorPrincipal;
		
	}	//fim da função mergeSort
	
	private void intercala(int[] vetorPrincipal, int inicio, int meio, int fim) {
		
		//Declara um vetor auxiliar de mesmo tamanho que o principal
		int[] vetorAuxiliar = new int[vetorPrincipal.length];
		
		//Preenche o vetor auxiliar
		for(int i = inicio; i <= fim; i++) {
			vetorAuxiliar[i] = vetorPrincipal[i];
		}
		
		//Declara os ponteiros
		int ponteiroEsquerda = inicio;
		int ponteiroDireita = meio + 1;
		
		for(int contador = inicio; contador <= fim; contador++) {
			
			//Condicionais para ordenar vetor
			
			if ( ponteiroEsquerda > meio) {			//ponteiro da esquerda passou do meio do vetor
				vetorPrincipal[contador] = vetorAuxiliar[ponteiroDireita];		
				ponteiroDireita++;		//Incrementa-se ponteiro da direita
			}
			else if ( ponteiroDireita > fim) {		//ponteiro da direita passou do fim do vetor
				vetorPrincipal[contador] = vetorAuxiliar[ponteiroEsquerda];
				ponteiroEsquerda++;		//Incrementa-se ponteiro da esquerda
			}
			else if ( vetorAuxiliar[ponteiroEsquerda] < vetorAuxiliar[ponteiroDireita] ) {
				vetorPrincipal[contador] = vetorAuxiliar[ponteiroEsquerda];
				ponteiroEsquerda++;		//Incrementa-se ponteiro da esquerda
			}
			else {
				vetorPrincipal[contador] = vetorAuxiliar[ponteiroDireita];
				ponteiroDireita++; 		//Incrementa-se ponteiro da direita
			}	//fim das condicionais
			
		}	//fim da repetição
		
	}	//fim da função intercala

}	//fim da classe controller 
