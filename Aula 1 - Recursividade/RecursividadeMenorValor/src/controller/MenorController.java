package controller;

public class MenorController {

	public MenorController() {
		super();
	}
	
	public int menor(int[] vetor, int tamanho, int menor) {
		//Condição de parada
		if(tamanho == 0) {
			return menor;
		} else {
			int ultimaPosicao = tamanho - 1;
			if(vetor[ultimaPosicao] < menor) {
				menor = vetor[ultimaPosicao]; 
			}
			return menor(vetor, tamanho-1, menor);	//Chamada da próxima função
		}
	}
		
}
