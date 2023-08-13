package controller;

public class VetorController {

	public VetorController() {
		super();
	}
	
	public int somaVetor(int[] vetor, int tamanho) {
		//Condição de parada
		if ( tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho - 1;
			int valor = vetor[ultimaPosicao];
			tamanho -= 1;
			
			return valor + somaVetor(vetor, tamanho);	//Chamada da próxima função
		}
	}

}
