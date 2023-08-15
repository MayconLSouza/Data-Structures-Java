package controller;

public class ParController {

	public ParController() {
		super();
	}
	
	public int par(int[] vetor, int tamanho) {
		//Condição de parada
		if(tamanho == 0) {
			return 0;
		} 
		int ultimaPosicao = tamanho - 1;
		if((vetor[ultimaPosicao] % 2) == 0) {
			return 1 + par(vetor, tamanho-1);	//Chamada da próxima função
		}
		return par(vetor, tamanho-1);	//Chamada da próxima função
	}

}
